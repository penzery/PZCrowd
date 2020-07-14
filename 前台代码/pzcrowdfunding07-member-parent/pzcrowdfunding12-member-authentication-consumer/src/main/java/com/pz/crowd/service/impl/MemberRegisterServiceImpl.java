package com.pz.crowd.service.impl;

import com.pz.crowd.api.CrowdMysqlRemoteService;
import com.pz.crowd.api.CrowdRedisRemoteService;
import com.pz.crowd.constant.CrowdConstant;
import com.pz.crowd.entity.po.MemberPO;
import com.pz.crowd.entity.vo.MemberVO;
import com.pz.crowd.service.api.MemberRegisterService;
import com.pz.crowd.util.CrowdUtil;
import com.pz.crowd.util.ResultEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class MemberRegisterServiceImpl implements MemberRegisterService {
    @Autowired
    private CrowdMysqlRemoteService crowdMysqlRemoteService;

    @Autowired
    private CrowdRedisRemoteService crowdRedisRemoteService;

    private Logger logger = LoggerFactory.getLogger(MemberRegisterServiceImpl.class);

    @Override
    public void sendCordMessage(String memberPhoneNum) {
        if (memberPhoneNum!=null && memberPhoneNum.length()==11 && memberPhoneNum.startsWith("1")){
            // 模拟发送验证码,将验证码打印在控制台
            String cord = CrowdUtil.sendCordMessage(memberPhoneNum);
            logger.warn(cord);

            String key = CrowdConstant.REDIS_MESSAGE_CORD_PREFIX+memberPhoneNum;
            // 向redis添加得到的验证码,ResultEntity封装了是否成功,如果失败将异常抛给Controller
            ResultEntity<String> saveCord = crowdRedisRemoteService.setStringKeyValueWithTimeoutRemote(key, cord, 5, TimeUnit.MINUTES);
            if (saveCord.getResult().equals("FAILED")){
                throw  new RuntimeException(saveCord.getMessage());
            }
        }else{
            throw new RuntimeException("手机号格式不正确");
        }
    }

    @Override
    public void registerMember(MemberVO memberVO) {
        String memberAccount = memberVO.getMemberAccount();
        String memberUsername = memberVO.getMemberUsername();
        String memberPassword = memberVO.getMemberPassword();
        String passwordRepeat = memberVO.getPasswordRepeat();
        String memberEmail = memberVO.getMemberEmail();
        String memberPhoneNum = memberVO.getMemberPhoneNum();
        String identifyingCord = memberVO.getIdentifyingCord();
        if (memberAccount==null||memberAccount.length()==0){
            throw new RuntimeException(CrowdConstant.MESSAGE_SAVE_EMPTY_ACCOUNT_WARNING);
        }
        if (memberUsername==null||memberUsername.length()==0){
            throw new RuntimeException(CrowdConstant.MESSAGE_SAVE_EMPTY_NAME_WARNING);
        }
        if (memberPassword==null||memberPassword.length()==0){
            throw new RuntimeException(CrowdConstant.MESSAGE_SAVE_EMPTY_PASSWORD_WARNING);
        }
        if (passwordRepeat==null||passwordRepeat.length()==0){
            throw new RuntimeException(CrowdConstant.MESSAGE_SAVE_EMPTY_PASSWORD_REPEAT_WARNING);
        }
        if (memberEmail==null||memberEmail.length()==0){
            throw new RuntimeException(CrowdConstant.MESSAGE_SAVE_EMPTY_EMAIL_WARNING);
        }
        if (memberPhoneNum==null||memberPhoneNum.length()==0){
            throw new RuntimeException("手机号不能为空");
        }
        if (identifyingCord==null||identifyingCord.length()==0){
            throw new RuntimeException("验证码不能为空");
        }

//        // 验证用户名是否可用  这里有并发安全问题
//        ResultEntity<Boolean> useful = crowdMysqlRemoteService.judgeMemberAccountUsefulRemote(memberAccount);
//        if (useful.getResult().equals("FAILED")){
//            throw new RuntimeException(useful.getMessage());
//        }
//        boolean data = useful.getData();
//        if (data==false){
//            throw new RuntimeException(CrowdConstant.MESSAGE_ADMIN_ACCT_ALREADY_IN_USE);
//        }

        // 验证两次密码是否相等
        if (!passwordRepeat.equals(memberPassword)){
            throw new RuntimeException(CrowdConstant.MESSAGE_SAVE_PASSWORD_UNEQUAL_WARNING);
        }

        // 从redis获取验证码
        ResultEntity<String> codeResultEntity = crowdRedisRemoteService.getStringValueByKeyRemote(CrowdConstant.REDIS_MESSAGE_CORD_PREFIX + memberPhoneNum);
        if (codeResultEntity.getResult().equals("FAILED")){
            throw new RuntimeException(codeResultEntity.getMessage());
        }
        String code = codeResultEntity.getData();

        if (!code.equals(identifyingCord)){
            throw new RuntimeException("验证码错误");
        }

        ResultEntity<String> redisRemoveResultEntity = crowdRedisRemoteService.removeKeyRemote(CrowdConstant.REDIS_MESSAGE_CORD_PREFIX + memberPhoneNum);
        if (redisRemoveResultEntity.getResult().equals("FAILED")){
            throw new RuntimeException(redisRemoveResultEntity.getMessage());
        }

        // 通过所有验证
        // 进行密码加密
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encode = bCryptPasswordEncoder.encode(memberPassword);
        memberVO.setMemberPassword(encode);

        // MemberVO转MemberPO
        MemberPO memberPO = new MemberPO();
        BeanUtils.copyProperties(memberVO,memberPO);

        // crowdMysqlRemoteService.saveMemberPORemote(memberPO)以json格式传输
        // 所以在接收端一定要加RequestBody
        ResultEntity saveResultEntity = crowdMysqlRemoteService.saveMemberPORemote(memberPO);
        if (saveResultEntity.getResult().equals("FAILED")){
            throw new RuntimeException(saveResultEntity.getMessage());
        }
    }
}
