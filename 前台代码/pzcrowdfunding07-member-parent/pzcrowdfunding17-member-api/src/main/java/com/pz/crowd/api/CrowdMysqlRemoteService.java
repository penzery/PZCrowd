package com.pz.crowd.api;

import com.pz.crowd.entity.po.AddressPO;
import com.pz.crowd.entity.po.MemberPO;
import com.pz.crowd.entity.vo.*;
import com.pz.crowd.util.ResultEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Component
@FeignClient(value = "pz-crowd-mysql")
public interface CrowdMysqlRemoteService {
    @RequestMapping("/provider/get/memberPO/by/member/account/remote")
    public ResultEntity<MemberPO> getMemberByMemberAccountRemote(@RequestParam("memberAccount")String memberAccount);

    @RequestMapping("/provider/judge/member/account/useful/remote")
    public ResultEntity<Boolean> judgeMemberAccountUsefulRemote(@RequestParam("memberAccount")String memberAccount);

    @RequestMapping("/provider/save/memberPO/remote")
    public ResultEntity saveMemberPORemote(@RequestBody MemberPO memberPO);

    @RequestMapping("/provider/save/projectVO/remote")
    public ResultEntity saveProjectVORemote(@RequestBody ProjectVO projectVO);

    @RequestMapping("/provider/get/portal/project/typeVO/list/remote")
    public ResultEntity<List<PortalProjectTypeVO>> getPortalTypeVOListRemote();

    @RequestMapping("/provider/get/detail/projectVO/remote")
    public ResultEntity<DetailProjectVO> getDetailProjectVORemote(@RequestParam("projectId")Long projectId);

    @RequestMapping("/provider/get/order/projectVO/remote")
    public ResultEntity<OrderProjectVO> getOrderProjectVORemote(@RequestParam("returnId")Long returnId);

    @RequestMapping("/provider/get/addressVO/list/remote")
    public ResultEntity<List<AddressVO>> getAddressVOListRemote(@RequestParam("memberId")Long memberId);

    @RequestMapping("/provider/save/new/address/remote")
    public ResultEntity saveNewAddressRemote(@RequestBody AddressPO addressPO);

    @RequestMapping("/provider/save/orderPO/remote")
    public ResultEntity saveOrderPORemote(@RequestBody OrderVO orderVO);
}
