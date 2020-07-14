package com.pz.crowd.controller;

import com.pz.crowd.constant.CrowdConstant;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Enumeration;

@RestController
public class TestController {
    @RequestMapping("/test")
    public String teat1(HttpSession session){
        Enumeration<String> attributeNames = session.getAttributeNames();
        System.out.println("aaa");
        while (attributeNames.hasMoreElements()){
            System.out.println(attributeNames.nextElement());
        }
        return "test";
    }
}
