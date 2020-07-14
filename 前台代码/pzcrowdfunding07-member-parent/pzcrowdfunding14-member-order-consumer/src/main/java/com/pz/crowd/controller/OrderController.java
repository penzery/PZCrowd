package com.pz.crowd.controller;

import com.pz.crowd.api.CrowdMysqlRemoteService;
import com.pz.crowd.constant.CrowdConstant;
import com.pz.crowd.entity.po.AddressPO;
import com.pz.crowd.entity.vo.AddressVO;
import com.pz.crowd.entity.vo.MemberLoginVO;
import com.pz.crowd.entity.vo.OrderProjectVO;
import com.pz.crowd.util.ResultEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class OrderController {
    @Autowired
    private CrowdMysqlRemoteService crowdMysqlRemoteService;
    @RequestMapping("/to/confirm/return/content/page.html")
    public String toConfirmReturnContentPage(@RequestParam("returnId")Long returnId, HttpSession session){
        ResultEntity<OrderProjectVO> orderProjectVORemote = crowdMysqlRemoteService.getOrderProjectVORemote(returnId);
        if (orderProjectVORemote.getResult().equals("SUCCESS")){
            OrderProjectVO data = orderProjectVORemote.getData();
            session.setAttribute("orderProjectVO",data);
        }
        return "order-return-confirm";
    }

    @RequestMapping("/to/confirm/order/page.html")
    public String toConfirmOrderPage(@RequestParam("returnCount")Integer returnCount,HttpSession session,HttpServletRequest request){
        OrderProjectVO orderProjectVO = (OrderProjectVO) session.getAttribute("orderProjectVO");
        orderProjectVO.setReturnCount(returnCount);
        session.setAttribute("orderProjectVO",orderProjectVO);
        MemberLoginVO memberLoginVO = (MemberLoginVO) session.getAttribute(CrowdConstant.ATTRIBUTE_SESSION_MEMBER_VO);
        ResultEntity<List<AddressVO>> addressVOListRemote = crowdMysqlRemoteService.getAddressVOListRemote(memberLoginVO.getMemberId());
        if (addressVOListRemote.getResult().equals("SUCCESS")){
            request.setAttribute("addressVOList",addressVOListRemote.getData());
        }
        return "order-confirm";
    }

    @RequestMapping("/to/confirm/order/page2.html")
    public String toConfirmOrderPage2(HttpSession session,HttpServletRequest request){
        MemberLoginVO memberLoginVO = (MemberLoginVO) session.getAttribute(CrowdConstant.ATTRIBUTE_SESSION_MEMBER_VO);
        ResultEntity<List<AddressVO>> addressVOListRemote = crowdMysqlRemoteService.getAddressVOListRemote(memberLoginVO.getMemberId());
        if (addressVOListRemote.getResult().equals("SUCCESS")){
            request.setAttribute("addressVOList",addressVOListRemote.getData());
        }
        return "order-confirm";
    }


    @RequestMapping("/save/new/address/info.html")
    public String saveNewAddress(AddressVO addressVO,HttpSession session){
        MemberLoginVO memberLoginVO = (MemberLoginVO) session.getAttribute(CrowdConstant.ATTRIBUTE_SESSION_MEMBER_VO);
        addressVO.setMemberId(memberLoginVO.getMemberId());
        AddressPO addressPO = new AddressPO();
        BeanUtils.copyProperties(addressVO,addressPO);
        ResultEntity resultEntity = crowdMysqlRemoteService.saveNewAddressRemote(addressPO);
        if (resultEntity.getResult().equals("SUCCESS")){
            session.setAttribute("addressMessage","新地址添加成功");
        }else{
            session.setAttribute("addressMessage","新地址添加失败，请重试");
        }
        return "redirect:http://localhost:800/order/to/confirm/order/page2.html";
    }
}
