package com.pz.crowd.controller;

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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@Controller
public class MemberRegisterController {

    @Autowired
    private MemberRegisterService memberRegisterService;

    private Logger logger = LoggerFactory.getLogger(MemberRegisterController.class);

    @ResponseBody
    @RequestMapping("/auth/member/send/cord/message.json")
    public ResultEntity sendCordMessage(@RequestParam("memberPhoneNum")String memberPhoneNum){
        try {
            memberRegisterService.sendCordMessage(memberPhoneNum);
            return ResultEntity.successWithoutData();
        } catch (Exception e) {
            return ResultEntity.failed(e.getMessage());
        }
    }


    @ResponseBody
    @RequestMapping("/auth/member/register/member.json")
    public ResultEntity registerMember(MemberVO memberVO){
        try {
            memberRegisterService.registerMember(memberVO);
            return ResultEntity.successWithoutData();
        } catch (Exception e) {
            return ResultEntity.failed(e.getMessage());
        }
    }




}
