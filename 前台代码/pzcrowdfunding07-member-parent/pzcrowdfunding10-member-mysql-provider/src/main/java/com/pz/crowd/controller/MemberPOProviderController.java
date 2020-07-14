package com.pz.crowd.controller;

import com.pz.crowd.entity.po.MemberPO;
import com.pz.crowd.service.api.MemberPOLocalService;
import com.pz.crowd.util.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberPOProviderController {
    @Autowired
    private MemberPOLocalService memberPOLocalService;

    @RequestMapping("/provider/get/memberPO/by/member/account/remote")
    public ResultEntity<MemberPO> getMemberByMemberAccountRemote(@RequestParam("memberAccount")String memberAccount){
         try {
             MemberPO memberPOByMemberAccount = memberPOLocalService.getMemberPOByMemberAccount(memberAccount);
             return ResultEntity.successWithData(memberPOByMemberAccount);
         }catch (Exception e){
             return ResultEntity.failed(e.getMessage());
         }
    }

    @RequestMapping("/provider/judge/member/account/useful/remote")
    public ResultEntity<Boolean> judgeMemberAccountUsefulRemote(@RequestParam("memberAccount")String memberAccount){
        try {
            Boolean useful = memberPOLocalService.judgeMemberAccountUseful(memberAccount);
            return ResultEntity.successWithData(useful);
        } catch (Exception e) {
            return ResultEntity.failed(e.getMessage());
        }
    }

    @RequestMapping("/provider/save/memberPO/remote")
    public ResultEntity saveMemberPORemote(@RequestBody MemberPO memberPO){
        try {
            memberPOLocalService.saveMemberPO(memberPO);
            return ResultEntity.successWithoutData();
        } catch (Exception e) {
            if (e instanceof DuplicateKeyException){
                return ResultEntity.failed("该账号已经被使用");
            }
            return ResultEntity.failed(e.getMessage());
        }
    }


}
