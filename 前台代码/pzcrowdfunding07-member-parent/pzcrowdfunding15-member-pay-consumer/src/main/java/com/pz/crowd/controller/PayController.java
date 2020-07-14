package com.pz.crowd.controller;

import com.pz.crowd.api.CrowdMysqlRemoteService;
import com.pz.crowd.entity.po.OrderPO;
import com.pz.crowd.entity.vo.OrderProjectVO;
import com.pz.crowd.entity.vo.OrderVO;
import com.pz.crowd.util.ResultEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Random;

@Controller
public class PayController {

    @Autowired
    private CrowdMysqlRemoteService crowdMysqlRemoteService;

    @ResponseBody
    @RequestMapping("/generate/order")
    public String generateOrder(OrderVO orderVO,HttpSession session){
        OrderProjectVO orderProjectVO = (OrderProjectVO) session.getAttribute("orderProjectVO");
        orderVO.setOrderProjectVO(orderProjectVO);
        session.removeAttribute("orderProjectVO");
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random()*10);
            buffer.append(random);
        }
        orderVO.setOrderNum(buffer.toString());
        Integer returnCount = orderProjectVO.getReturnCount();
        Integer freight = orderProjectVO.getFreight();
        Integer supportMoney = orderProjectVO.getSupportMoney().intValue();
        Double money = Double.valueOf(returnCount*supportMoney+freight);
        orderVO.setOrderMoney(money);
        ResultEntity resultEntity = crowdMysqlRemoteService.saveOrderPORemote(orderVO);
        if (resultEntity.getResult().equals("SUCCESS")){
            return "支付成功,订单号为:"+buffer.toString();
        }

        return "支付失败，失败原因为"+resultEntity.getMessage();

    }
}
