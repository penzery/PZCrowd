package com.pz.crowd.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CrowdProjectMVCConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/to/agree/protocol/page.html").setViewName("project-protocol");
        registry.addViewController("/to/launch/project/page.html").setViewName("project-launch");
        registry.addViewController("/to/collect/return/info/page.html").setViewName("project-return");
        registry.addViewController("/to/create/confirm/page.html").setViewName("project-confirm");
    }
}
