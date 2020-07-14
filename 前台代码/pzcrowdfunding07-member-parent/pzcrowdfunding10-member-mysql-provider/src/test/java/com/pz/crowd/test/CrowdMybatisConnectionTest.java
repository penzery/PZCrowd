package com.pz.crowd.test;

import com.pz.crowd.entity.po.*;
import com.pz.crowd.entity.vo.*;
import com.pz.crowd.mapper.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CrowdMybatisConnectionTest {
    @Autowired
    private OrderProjectPOMapper orderProjectPOMapper;

    @Autowired
    private ProjectPOMapper projectPOMapper;

    @Autowired
    private AddressPOMapper addressPOMapper;



    private Logger logger = LoggerFactory.getLogger(CrowdMybatisConnectionTest.class);


    @Test
    public void test4(){
        List<AddressVO> addressVOS = addressPOMapper.selectAddressVOList((long) 13);
        System.out.println(addressVOS);
    }






}
