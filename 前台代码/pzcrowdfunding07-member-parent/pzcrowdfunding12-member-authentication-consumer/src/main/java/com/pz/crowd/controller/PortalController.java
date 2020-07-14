package com.pz.crowd.controller;

import com.pz.crowd.api.CrowdMysqlRemoteService;
import com.pz.crowd.constant.CrowdConstant;
import com.pz.crowd.entity.vo.PortalProjectTypeVO;
import com.pz.crowd.util.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;
import java.util.List;

@Controller
public class PortalController {

    @Autowired
    private CrowdMysqlRemoteService crowdMysqlRemoteService;
    @RequestMapping("/")
    public String showPortal(HttpServletRequest request){
        ResultEntity<List<PortalProjectTypeVO>> portalTypeVOListRemote = crowdMysqlRemoteService.getPortalTypeVOListRemote();
        if (portalTypeVOListRemote.getResult().equals("SUCCESS")){
            List<PortalProjectTypeVO> portalTypeVOList = portalTypeVOListRemote.getData();
            request.setAttribute("portalTypeVOList",portalTypeVOList);
        }
        return "portal";
    }
}
