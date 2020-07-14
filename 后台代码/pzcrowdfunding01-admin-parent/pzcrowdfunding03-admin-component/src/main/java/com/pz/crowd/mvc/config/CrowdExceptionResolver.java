package com.pz.crowd.mvc.config;

import com.google.gson.Gson;
import com.pz.crowd.constant.CrowdConstant;
import com.pz.crowd.exception.*;
import com.pz.crowd.util.CrowdUtil;
import com.pz.crowd.util.ResultEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLIntegrityConstraintViolationException;

/*
处理@RequestMapping产生的异常的类  用@ControllerAdvice将该类加入到ioc容器
 */
@ControllerAdvice
public class CrowdExceptionResolver {

    private Logger logger= LoggerFactory.getLogger(CrowdExceptionResolver.class);

    // AccessDeniedException处理方法，该异常是Spring-Security进行权限控制时用户没有访问权限的异常
    // 在对Controller方法标注 @PreAuthorize 注解时，产生异常归Spring MVC处理，来找这个异常处理器
    // 在对 WebAppSecurityConfig 中的 HttpSecurity security 配置资源所需权限时，没有权限造成的异常归Spring-Security处理，不会走这个异常处理器
    @ExceptionHandler(value = AccessDeniedException.class)
    public ModelAndView accessDeniedExceptionResolver(AccessDeniedException accessDeniedException,HttpServletRequest request,HttpServletResponse response){
        return commonResolve("system-error",accessDeniedException,request,response);
    }

    // 在对当前登陆的用户执行删除操作时会出现这个异常
    @ExceptionHandler(value = {DeleteCurrentAdminException.class})
    public ModelAndView deleteCurrentAdminExceptionResolver(DeleteCurrentAdminException deleteCurrentAdminException, HttpServletRequest request, HttpServletResponse response){
        return commonResolve("system-error",deleteCurrentAdminException,request,response);
    }

    // 处理新增用户产生的异常
    @ExceptionHandler(value = {SaveAdminFailedException.class})
    public ModelAndView saveAdminFailedExceptionResolver(SaveAdminFailedException saveAdminFailedException, HttpServletRequest request, HttpServletResponse response){
        return commonResolve("admin/admin-add",saveAdminFailedException,request,response);
    }

    // 处理修改用户产生的异常
    @ExceptionHandler(value = {UpdateAdminFailedException.class})
    public ModelAndView updateAdminFailedExceptionResolver(UpdateAdminFailedException updateAdminFailedException, HttpServletRequest request, HttpServletResponse response){
        return commonResolve("system-error",updateAdminFailedException,request,response);
    }

    // 处理操作角色产生的异常
    @ExceptionHandler(value = {DoRoleException.class})
    public ModelAndView doRoleExceptionResolver(DoRoleException doRoleException, HttpServletRequest request, HttpServletResponse response){
        return commonResolve("system-error",doRoleException,request,response);
    }


    @ExceptionHandler(value = {MenuFailedException.class})
    public ModelAndView menuFailedExceptionResolver(MenuFailedException menuFailedException,HttpServletRequest request, HttpServletResponse response){
        return commonResolve(null,menuFailedException,request,response);
    }



    // 上面所有异常解析器都未能处理的异常由这个异常处理器处理
    @ExceptionHandler(value = Exception.class)
    public ModelAndView exceptionResolve(Exception exception,HttpServletRequest request,HttpServletResponse response){
        return commonResolve("system-error",exception,request,response);
    }

    // 通用的异常处理方法
    public ModelAndView commonResolve(String viewName,Exception exception, HttpServletRequest request, HttpServletResponse response){
        if (CrowdUtil.judgeRequestType(request)){
            //ajax请求
            ResultEntity<Object> failed = ResultEntity.failed(exception.getMessage());
            Gson gson=new Gson();
            String json = gson.toJson(failed);
            try {
                response.getWriter().write(json);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(CrowdConstant.ATTRIBUTE_EXCEPTION_NAME,exception);
        modelAndView.setViewName(viewName);
        return modelAndView;
    }
}
