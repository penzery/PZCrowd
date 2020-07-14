package com.pz.crowd.controller;

import com.pz.crowd.api.CrowdMysqlRemoteService;
import com.pz.crowd.entity.vo.DetailProjectVO;
import com.pz.crowd.util.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ProjectDetailController {
    @Autowired
    private CrowdMysqlRemoteService crowdMysqlRemoteService;


    @RequestMapping("/to/detail/project/page.html")
    public String toDetailProjectPage(@RequestParam("projectId")Long projectId, HttpServletRequest request){
        ResultEntity<DetailProjectVO> detailProjectVORemote = crowdMysqlRemoteService.getDetailProjectVORemote(projectId);
        if (detailProjectVORemote.getResult().equals("SUCCESS")){
            request.setAttribute("detailProjectVO",detailProjectVORemote.getData());
        }
        return "project-detail";
    }
}
