package com.pz.crowd.mvc.config;

import com.pz.crowd.constant.CrowdConstant;
import com.pz.crowd.exception.LoginFailedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
Spring-Security配置类 相当于ioc的配置文件xml
用@Configuration注解表示这是一个Spring配置类
 */
@Configuration
//开启webSecurity功能
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebAppSecurityConfig extends WebSecurityConfigurerAdapter{

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder builder) throws Exception {
        builder.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
    }

    @Override
    protected void configure(HttpSecurity security) throws Exception {
        security.authorizeRequests()

                // 放行静态资源
                .antMatchers("/index.jsp")
                .permitAll()
                .antMatchers("/admin/to/login/page.html")
                .permitAll()
                .antMatchers("/bootstrap/**")
                .permitAll()
                .antMatchers("/crowd-js/**")
                .permitAll()
                .antMatchers("/css/**")
                .permitAll()
                .antMatchers("/fonts/**")
                .permitAll()
                .antMatchers("/img/**")
                .permitAll()
                .antMatchers("/jquery/**")
                .permitAll()
                .antMatchers("/layer/**")
                .permitAll()
                .antMatchers("/script/**")
                .permitAll()
                .antMatchers("/ztree/**")
                .permitAll()
                .antMatchers("/admin/to/add/page.html")
                .hasAuthority("admin:add")
                // 其他请求都需要验证
                .anyRequest()
                .authenticated()
                .and()
                // 开启异常处理器，访问被拒绝异常交给自定义AccessDeniedHandler处理，只会处理Spring-Security的无权限异常，产生在Spring MVC处的归Spring MVC处理
                // 未登陆也不会触发，而是直接去登陆页面
                .exceptionHandling()
                .accessDeniedHandler(new AccessDeniedHandler() {
                    @Override
                    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException {
                        httpServletRequest.setAttribute("exception",e);
                        httpServletRequest.getRequestDispatcher("/WEB-INF/system-error.jsp").forward(httpServletRequest,httpServletResponse);
                    }
                })
                .and()
                // 关闭csrf功能
                .csrf()
                .disable()
                // 开启表单登陆功能，指定登陆界面
                .formLogin()
                .loginPage("/admin/to/login/page.html")
                // 设置处理登陆的请求地址，由Spring-Security处理
                .loginProcessingUrl("/security/do/login.html")
                .usernameParameter("loginAccount")
                .passwordParameter("userPassword")
                // 登陆成功重定向到该地址
                .defaultSuccessUrl("/admin/to/main/page.html")
                // 登陆失败的处理器，由于登陆不涉及到Spring MVC，所以失败异常都会由这个 AuthenticationFailureHandler 处理
                .failureHandler(new AuthenticationFailureHandler() {
                    // 登陆失败转发到登陆页面并附带异常信息
                    @Override
                    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
                        httpServletRequest.setAttribute("exception",new LoginFailedException(CrowdConstant.MESSAGE_ACCOUNT_OR_PASSWORD_WRONG));
                        httpServletRequest.getRequestDispatcher("/WEB-INF/admin/admin-login.jsp").forward(httpServletRequest,httpServletResponse);
                    }
                })
                .and()
                .logout()
                .logoutUrl("/security/do/logout.html")
                .logoutSuccessUrl("/admin/to/login/page.html");

    }
}
