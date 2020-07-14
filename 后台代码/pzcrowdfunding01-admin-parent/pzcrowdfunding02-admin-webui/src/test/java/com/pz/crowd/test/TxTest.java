package com.pz.crowd.test;

import com.pz.crowd.entity.Admin;
import com.pz.crowd.service.api.AdminService;
import com.pz.crowd.service.impl.AdminServiceImpl;
import com.pz.crowd.util.CrowdUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-persist-mybatis.xml","classpath:spring-persist-tx.xml"})
public class TxTest {

    //AdminServiceImpl实现了AdminService接口，所以从ioc容器中获取应该获取接口类型
    @Autowired
    private AdminService adminService;


    @Test
    public void saveAdminTxTest(){

        for (int i = 300; i < 330; i++) {
            String aaa = CrowdUtil.md5("aaa");
            Admin admin = new Admin(null,"TestAccount"+i,aaa,"Test","Test",new Date());
            adminService.saveAdmin(admin);
        }

    }
}
