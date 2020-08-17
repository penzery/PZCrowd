package com.pz.crowd.controller;

import com.pz.crowd.api.CrowdMysqlRemoteService;
import com.pz.crowd.entity.vo.DetailProjectVO;
import com.pz.crowd.service.api.DetailProjectService;
import com.pz.crowd.util.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ProjectDetailController {
    @Autowired
    private CrowdMysqlRemoteService crowdMysqlRemoteService;
    @Autowired
    private DetailProjectService detailProjectService;

    @RequestMapping("/to/detail/project/page.html")
    public String toDetailProjectPage(@RequestParam("projectId")Long projectId, HttpServletRequest request){
        DetailProjectVO detailProjectVO = detailProjectService.getDetailProjectVO(projectId);
        request.setAttribute("detailProjectVO",detailProjectVO);
        return "project-detail";
    }
}
