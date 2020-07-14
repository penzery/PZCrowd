package com.pz.crowd.service.impl;

import com.pz.crowd.api.CrowdMysqlRemoteService;
import com.pz.crowd.constant.CrowdConstant;
import com.pz.crowd.entity.po.MemberPO;
import com.pz.crowd.entity.vo.MemberLoginVO;
import com.pz.crowd.service.api.MemberLoginService;
import com.pz.crowd.util.ResultEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MemberLoginServiceImpl implements MemberLoginService {
    @Autowired
    private CrowdMysqlRemoteService crowdMysqlRemoteService;

    @Override
    public MemberLoginVO doLogin(String memberAccount, String memberPassword) {
        if (memberAccount==null || memberAccount.length()==0){
            throw new RuntimeException(CrowdConstant.MESSAGE_SAVE_EMPTY_ACCOUNT_WARNING);
        }
        if (memberPassword==null || memberPassword.length()==0){
            throw new RuntimeException(CrowdConstant.MESSAGE_SAVE_EMPTY_PASSWORD_WARNING);
        }
        ResultEntity<MemberPO> memberPOResultEntity = crowdMysqlRemoteService.getMemberByMemberAccountRemote(memberAccount);
        if (memberPOResultEntity.getResult().equals("FAILED")){
            throw new RuntimeException(memberPOResultEntity.getMessage());
        }

        MemberPO memberPO = memberPOResultEntity.getData();

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        if (!encoder.matches(memberPassword,memberPO.getMemberPassword())){
            throw new RuntimeException(CrowdConstant.MESSAGE_ACCOUNT_OR_PASSWORD_WRONG);
        }

        MemberLoginVO memberLoginVO = new MemberLoginVO();
        BeanUtils.copyProperties(memberPO,memberLoginVO);

        return memberLoginVO;

    }
}
