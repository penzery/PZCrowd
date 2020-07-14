package com.pz.crowd.mvc.controller;

import com.github.pagehelper.PageInfo;
import com.pz.crowd.entity.Role;
import com.pz.crowd.service.api.RoleService;
import com.pz.crowd.util.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoleController {
    @Autowired
    RoleService roleService;

    @PreAuthorize("hasAuthority('role:get')")
    @RequestMapping("/role/get/pageInfo.json")
    public ResultEntity<PageInfo<Role>> getPageInfo(
            @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize",defaultValue = "10")Integer pageSize,
            @RequestParam(value = "keyword",defaultValue = "")String keyword
    ){
        PageInfo<Role> pageInfo = roleService.getPageInfo(pageNum, pageSize, keyword);
        ResultEntity<PageInfo<Role>> pageInfoResultEntity = ResultEntity.successWithData(pageInfo);
        return pageInfoResultEntity;
    }

    @PreAuthorize("hasAuthority('role:add')")
    @RequestMapping("/role/save.json")
    public ResultEntity saveRole(
            @RequestParam(value = "roleName")String roleName
    ){
        roleService.saveRole(roleName);
        ResultEntity<Object> resultEntity = ResultEntity.successWithoutData();
        return resultEntity;
    }

    @PreAuthorize("hasAuthority('role:update')")
    @RequestMapping("/role/update.json")
    public ResultEntity updateRole(Role role){
        roleService.updateRole(role);
        ResultEntity<Object> objectResultEntity = ResultEntity.successWithoutData();
        return objectResultEntity;
    }

    @PreAuthorize("hasAuthority('role:delete')")
    @RequestMapping("/role/remove.json")
    public ResultEntity removeRole(@RequestBody List<Long> idList){
        roleService.removeRoleByIdList(idList);
        ResultEntity<Object> objectResultEntity = ResultEntity.successWithoutData();
        return objectResultEntity;
    }
}
