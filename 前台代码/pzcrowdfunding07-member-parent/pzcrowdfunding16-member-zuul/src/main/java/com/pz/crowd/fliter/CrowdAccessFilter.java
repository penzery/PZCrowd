package com.pz.crowd.fliter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.pz.crowd.constant.AccessPassResource;
import com.pz.crowd.constant.CrowdConstant;
import com.pz.crowd.entity.vo.MemberLoginVO;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

// 要加到ioc容器中才有作用
@Component
public class CrowdAccessFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String servletPath = request.getServletPath();
        boolean contains = AccessPassResource.PASS_RES_SET.contains(servletPath);
        if (contains){
            return false;
        }
        return !AccessPassResource.judgeIsStaticResourceRequest(servletPath);
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        HttpSession session = request.getSession();
        MemberLoginVO attribute = (MemberLoginVO) session.getAttribute(CrowdConstant.ATTRIBUTE_SESSION_MEMBER_VO);
        if (attribute==null){
            session.setAttribute(CrowdConstant.ATTRIBUTE_SESSION_EMPTY_MEMBER_WARNING,CrowdConstant.MESSAGE_ACCESS_FORBIDDEN);
            HttpServletResponse response = currentContext.getResponse();
            try {
                response.sendRedirect("/auth/to/member/login/page.html");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
