package com.pz.crowd.controller;

import com.pz.crowd.entity.vo.DetailProjectVO;
import com.pz.crowd.entity.vo.PortalProjectTypeVO;
import com.pz.crowd.entity.vo.ProjectVO;
import com.pz.crowd.service.api.ProjectPOLocalService;
import com.pz.crowd.util.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectPOProviderController {

    @Autowired
    private ProjectPOLocalService projectPOLocalService;

    @RequestMapping("/provider/save/projectVO/remote")
    public ResultEntity saveProjectVORemote(@RequestBody ProjectVO projectVO){
        ResultEntity resultEntity = projectPOLocalService.saveProjectVO(projectVO);
        return resultEntity;
    }


    @RequestMapping("/provider/get/portal/project/typeVO/list/remote")
    public ResultEntity<List<PortalProjectTypeVO>> getPortalTypeVOListRemote(){
        ResultEntity<List<PortalProjectTypeVO>> portalProjectTypeVOList = projectPOLocalService.getPortalProjectTypeVOList();
        return portalProjectTypeVOList;
    }

    @RequestMapping("/provider/get/detail/projectVO/remote")
    public ResultEntity<DetailProjectVO> getDetailProjectVORemote(@RequestParam("projectId")Long projectId){
        ResultEntity<DetailProjectVO> detailProjectVOById = projectPOLocalService.getDetailProjectVOById(projectId);
        return detailProjectVOById;
    }
}
