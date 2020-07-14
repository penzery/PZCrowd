package com.pz.crowd.constant;

import java.util.HashSet;
import java.util.Set;

public class AccessPassResource {
    public static final Set<String> PASS_RES_SET = new HashSet<>();

    static {
        PASS_RES_SET.add("/");
        PASS_RES_SET.add("/auth/to/member/registry/page.html");
        PASS_RES_SET.add("/auth/to/member/login/page.html");
        PASS_RES_SET.add("/auth/member/send/cord/message.json");
        PASS_RES_SET.add("/auth/member/register/member.json");
        PASS_RES_SET.add("/auth/member/do/login.html");
        PASS_RES_SET.add("/auth/member/logout.html");
    }

    public static final Set<String> STATIC_RES_SET = new HashSet<>();

    static {
        STATIC_RES_SET.add("bootstrap");
        STATIC_RES_SET.add("css");
        STATIC_RES_SET.add("fonts");
        STATIC_RES_SET.add("img");
        STATIC_RES_SET.add("jquery");
        STATIC_RES_SET.add("layer");
        STATIC_RES_SET.add("script");
        STATIC_RES_SET.add("ztree");
    }

    public static boolean judgeIsStaticResourceRequest(String servletPath){
        if (servletPath==null || servletPath.length()==0){
            throw new RuntimeException("字符串格式错误");
        }
        String[] split = servletPath.split("/");
        if (split.length==0){
            return false;
        }
        String s = split[1];
        if (STATIC_RES_SET.contains(s)){
            return true;
        }
        return false;
    }
}
