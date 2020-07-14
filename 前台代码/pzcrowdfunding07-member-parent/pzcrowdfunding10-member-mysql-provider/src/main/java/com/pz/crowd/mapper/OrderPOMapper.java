package com.pz.crowd.mapper;

import com.pz.crowd.entity.po.OrderPO;
import com.pz.crowd.entity.po.OrderPOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderPOMapper {
    long countByExample(OrderPOExample example);

    int deleteByExample(OrderPOExample example);

    int deleteByPrimaryKey(Long orderId);

    int insert(OrderPO record);

    int insertSelective(OrderPO record);

    List<OrderPO> selectByExample(OrderPOExample example);

    OrderPO selectByPrimaryKey(Long orderId);

    int updateByExampleSelective(@Param("record") OrderPO record, @Param("example") OrderPOExample example);

    int updateByExample(@Param("record") OrderPO record, @Param("example") OrderPOExample example);

    int updateByPrimaryKeySelective(OrderPO record);

    int updateByPrimaryKey(OrderPO record);
}