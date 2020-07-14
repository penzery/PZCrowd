package com.pz.crowd.test;

import com.pz.crowd.entity.Admin;
import com.pz.crowd.entity.Role;
import com.pz.crowd.mapper.AdminMapper;
import com.pz.crowd.mapper.RoleMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Date;

//注解是Spring整合JUnit测试，可以直接将ioc容器的bean通过Autowired自动注入
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-persist-mybatis.xml"})
public class ConnectionTest {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Test
    public void testRoleMapper(){
        for (int i = 0; i < 236; i++) {
            Role role = new Role(null,"role"+i);
            roleMapper.insert(role);
        }
    }

    @Test
    public void loggerTest(){
        Logger logger = LoggerFactory.getLogger(ConnectionTest.class);
        /*
        级别  debug
             info
             warn
             error
             在一个级别，这个级别和他以上的级别都会被打印
         */
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
    }

    @Test
    public void testAdminMapper(){
        Date nowTime = new Date();
        Admin admin = new Admin(null,"tom111","password","汤姆","tom@gmail.com",nowTime);
        int insert = adminMapper.insert(admin);
        Logger logger = LoggerFactory.getLogger(ConnectionTest.class);
        logger.debug("受影响行数==="+insert);
    }

    @Test
    public void testConnection() throws SQLException {
        System.out.println(dataSource.getConnection());
    }
}
