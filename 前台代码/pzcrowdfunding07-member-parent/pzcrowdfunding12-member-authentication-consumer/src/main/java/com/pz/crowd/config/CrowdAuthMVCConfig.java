package com.pz.crowd.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CrowdAuthMVCConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/auth/to/member/registry/page.html").setViewName("member-reg");

        registry.addViewController("/auth/to/member/login/page.html").setViewName("member-login");

        registry.addViewController("/auth/to/member/main/page.html").setViewName("member-main");
        registry.addViewController("/member/my/crowd").setViewName("member-crowd");
    }
}
