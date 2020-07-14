package com.pz.crowd.mvc.controller;

import com.pz.crowd.entity.Auth;
import com.pz.crowd.entity.Role;
import com.pz.crowd.service.api.AdminService;
import com.pz.crowd.service.api.AuthService;
import com.pz.crowd.service.api.RoleService;
import com.pz.crowd.util.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class AssignController {

    @Autowired
    AdminService adminService;

    @Autowired
    RoleService roleService;

    @Autowired
    AuthService authService;

    @RequestMapping("/assign/to/assign/role/page.html")
    public String getAdminRoleRelation(
            @RequestParam("adminId") Long adminId,
            ModelMap modelMap
    ){
        List<Role> assignedRoleList = roleService.getAssignedRole(adminId);

        List<Role> unassignedRoleList = roleService.getUnassignedRole(adminId);

        modelMap.addAttribute("assignedRoleList",assignedRoleList);
        modelMap.addAttribute("unassignedRoleList",unassignedRoleList);

        return "assign/assign-role";
    }

    @RequestMapping("/assign/save/relationship.html")
    public String saveAdminRoleRelationship(
            @RequestParam("adminId") Long adminId,
            @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
            @RequestParam("keyword") String keyword,
            @RequestParam("roleIdList") List<Long> roleIdList
    ){
        roleService.removeOldAdminRoleRelationship(adminId);
        roleService.saveNewAdminRoleRelationship(adminId,roleIdList);
        String view="redirect:/admin/get/pageInfo.html?pageNum="+pageNum;
        if (keyword!= null && keyword.length()>0){
            view = "redirect:/admin/get/pageInfo.html?pageNum="+pageNum+"&keyword="+keyword;
        }
        return view;
    }

    @ResponseBody
    @RequestMapping("/assign/get/auth/tree.json")
    public ResultEntity<List<Auth>> getAuthTreeList(){
        List<Auth> authList = authService.getAllAuthList();
        ResultEntity<List<Auth>> listResultEntity = ResultEntity.successWithData(authList);
        return listResultEntity;
    }

    @ResponseBody
    @RequestMapping("/assign/get/assigned/auth.json")
    public ResultEntity<List<Auth>> getAssignedAuthList(@RequestParam("roleId") Long roleId){
        List<Auth> assignedAuthList = authService.getAssignedAuthList(roleId);
        return ResultEntity.successWithData(assignedAuthList);
    }

    @ResponseBody
    @RequestMapping("/assign/save/role/auth/relationship.json")
    public ResultEntity saveRoleAuthRelationship(@RequestBody Map<String,List<Long>> map){
        List<Long> authIdArray = map.get("authIdArray");
        Long roleId = map.get("roleId").get(0);
        authService.saveRoleAuthRelationship(roleId,authIdArray);
        return ResultEntity.successWithoutData();
    }
}
