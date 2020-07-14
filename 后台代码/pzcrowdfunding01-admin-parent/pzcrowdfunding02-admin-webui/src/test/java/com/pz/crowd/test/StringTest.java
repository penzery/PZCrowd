package com.pz.crowd.test;

import com.pz.crowd.util.CrowdUtil;
import org.junit.Test;

public class StringTest {
    @Test
    public void stringTest(){
        String str = "123123";
        String md5 = CrowdUtil.md5(str);
        System.out.println(md5);
    }

}
