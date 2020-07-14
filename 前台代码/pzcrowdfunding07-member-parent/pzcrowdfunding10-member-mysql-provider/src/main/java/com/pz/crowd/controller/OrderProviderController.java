package com.pz.crowd.controller;

import com.pz.crowd.entity.po.AddressPO;
import com.pz.crowd.entity.vo.AddressVO;
import com.pz.crowd.entity.vo.OrderProjectVO;
import com.pz.crowd.entity.vo.OrderVO;
import com.pz.crowd.service.api.OrderLocalService;
import com.pz.crowd.util.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderProviderController {
    @Autowired
    private OrderLocalService orderLocalService;


    @RequestMapping("/provider/get/order/projectVO/remote")
    public ResultEntity<OrderProjectVO> getOrderProjectVORemote(@RequestParam("returnId")Long returnId){
        try {
            OrderProjectVO orderProjectVO = orderLocalService.getOrderProjectVO(returnId);
            return ResultEntity.successWithData(orderProjectVO);
        } catch (Exception e) {
            return ResultEntity.failed(e.getMessage());
        }
    }

    @RequestMapping("/provider/get/addressVO/list/remote")
    public ResultEntity<List<AddressVO>> getAddressVOListRemote(@RequestParam("memberId")Long memberId){
        try {
            List<AddressVO> addressVoList = orderLocalService.getAddressVoList(memberId);
            return ResultEntity.successWithData(addressVoList);
        } catch (Exception e) {
            return ResultEntity.failed(e.getMessage());
        }
    }

    @RequestMapping("/provider/save/new/address/remote")
    public ResultEntity saveNewAddressRemote(@RequestBody AddressPO addressPO){
        try {
            orderLocalService.saveNewAddress(addressPO);
            return ResultEntity.successWithoutData();
        } catch (Exception e) {
            return ResultEntity.failed(e.getMessage());
        }
    }

    @RequestMapping("/provider/save/orderPO/remote")
    public ResultEntity saveOrderPORemote(@RequestBody OrderVO orderVO){
        try {
            orderLocalService.saveOrderPO(orderVO);
            return ResultEntity.successWithoutData();
        } catch (Exception e) {
            return ResultEntity.failed(e.getMessage());
        }
    }


}
