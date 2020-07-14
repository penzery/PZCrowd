package com.pz.crowd.mvc.controller;

import com.pz.crowd.entity.ProjectVO;
import com.pz.crowd.service.api.AuditService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class AuditController {
    @Autowired
    private AuditService auditService;
    private Logger logger= LoggerFactory.getLogger(AuditController.class);
    @RequestMapping("/audit/to/audit.html")
    public String getProjectVO(HttpServletRequest request){
        List<ProjectVO> projectVOs = auditService.getProjectVOs();
        request.setAttribute("projectVO",projectVOs);
        return "audit/audit";
    }
}
