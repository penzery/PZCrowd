package com.pz.crowd.service.api;

import com.pz.crowd.entity.po.AddressPO;
import com.pz.crowd.entity.vo.AddressVO;
import com.pz.crowd.entity.vo.OrderProjectVO;
import com.pz.crowd.entity.vo.OrderVO;

import java.util.List;

public interface OrderLocalService {
    OrderProjectVO getOrderProjectVO(Long returnId);

    List<AddressVO> getAddressVoList(Long memberId);

    void saveNewAddress(AddressPO addressPO);

    void saveOrderPO(OrderVO orderVO);
}
