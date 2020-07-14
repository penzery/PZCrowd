package com.pz.crowd.service.impl;

import com.pz.crowd.entity.po.AddressPO;
import com.pz.crowd.entity.po.OrderPO;
import com.pz.crowd.entity.po.OrderProjectPO;
import com.pz.crowd.entity.vo.AddressVO;
import com.pz.crowd.entity.vo.OrderProjectVO;
import com.pz.crowd.entity.vo.OrderVO;
import com.pz.crowd.mapper.AddressPOMapper;
import com.pz.crowd.mapper.OrderPOMapper;
import com.pz.crowd.mapper.OrderProjectPOMapper;
import com.pz.crowd.service.api.OrderLocalService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderLocalServiceImpl implements OrderLocalService {
    @Autowired
    private OrderProjectPOMapper orderProjectPOMapper;

    @Autowired
    private AddressPOMapper addressPOMapper;

    @Autowired
    private OrderPOMapper orderPOMapper;

    @Transactional(readOnly = true)
    @Override
    public OrderProjectVO getOrderProjectVO(Long returnId) {
        OrderProjectVO orderProjectVO = orderProjectPOMapper.selectOrderProjectVO(returnId);

        return orderProjectVO;
    }

    @Transactional(readOnly = true)
    @Override
    public List<AddressVO> getAddressVoList(Long memberId) {
        List<AddressVO> addressVOS = addressPOMapper.selectAddressVOList(memberId);
        return addressVOS;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW,rollbackFor = Exception.class)
    @Override
    public void saveNewAddress(AddressPO addressPO) {
        addressPOMapper.insert(addressPO);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW,rollbackFor = Exception.class)
    @Override
    public void saveOrderPO(OrderVO orderVO) {
        Integer orderInvoice = orderVO.getOrderInvoice();
        if (orderInvoice==0){
            orderVO.setOrderInvoiceTitle(null);
        }
        OrderPO orderPO =new OrderPO();
        BeanUtils.copyProperties(orderVO,orderPO);
        orderPOMapper.insertSelective(orderPO);
        Long orderId = orderPO.getOrderId();
        OrderProjectVO orderProjectVO = orderVO.getOrderProjectVO();
        OrderProjectPO orderProjectPO = new OrderProjectPO();
        BeanUtils.copyProperties(orderProjectVO,orderProjectPO);
        orderProjectPO.setOrderId(orderId);
        orderProjectPOMapper.insert(orderProjectPO);
    }
}
