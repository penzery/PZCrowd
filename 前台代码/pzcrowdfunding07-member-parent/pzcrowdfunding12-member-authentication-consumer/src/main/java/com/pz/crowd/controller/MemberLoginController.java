package com.pz.crowd.controller;

import com.netflix.ribbon.proxy.annotation.Http;
import com.pz.crowd.constant.CrowdConstant;
import com.pz.crowd.entity.vo.MemberLoginVO;
import com.pz.crowd.service.api.MemberLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class MemberLoginController {
    @Autowired
    private MemberLoginService memberLoginService;

    @RequestMapping("/auth/member/do/login.html")
    public String doLogin(@RequestParam("memberAccount")String memberAccount,
                          @RequestParam("memberPassword")String memberPassword,
                          HttpSession session,
                          HttpServletRequest request
    ){
        try {
            MemberLoginVO memberLoginVO = memberLoginService.doLogin(memberAccount, memberPassword);
            session.setAttribute(CrowdConstant.ATTRIBUTE_SESSION_MEMBER_VO,memberLoginVO);
            return "redirect:http://localhost:800/auth/to/member/main/page.html";
        } catch (Exception e) {
            request.setAttribute("exceptionMessage",e.getMessage());
            if (e.getMessage().equals(CrowdConstant.MESSAGE_ACCOUNT_OR_PASSWORD_WRONG)){
                request.setAttribute("memberAccount",memberAccount);
            }
            return "member-login";
        }
    }

    @RequestMapping("/auth/member/logout.html")
    public String doLogout(HttpSession session,HttpServletRequest request){
        session.invalidate();
        return "redirect:http://localhost:800";
    }
}
