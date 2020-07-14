package com.pz.crowd.mvc.controller;

import com.github.pagehelper.PageInfo;
import com.pz.crowd.constant.CrowdConstant;
import com.pz.crowd.entity.Admin;
import com.pz.crowd.exception.DeleteCurrentAdminException;
import com.pz.crowd.mvc.config.SecurityAdmin;
import com.pz.crowd.service.api.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    private Logger logger= LoggerFactory.getLogger(AdminController.class);

    @PreAuthorize("hasAuthority('admin:get')")
    @RequestMapping("/admin/get/pageInfo.html")
    public String getPageInfo(
            @RequestParam(value="keyword",defaultValue = "") String keyword,
            @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
            ModelMap modelMap
    ){
        PageInfo<Admin> adminPageInfo = adminService.getPageInfo(keyword, pageNum, pageSize);
        modelMap.addAttribute(CrowdConstant.ATTRIBUTE_ADMIN_PAGEINFO_NAME,adminPageInfo);
        return "admin/admin-page";
    }

    @PreAuthorize("hasAuthority('admin:delete')")
    @RequestMapping("/admin/remove.html")
    public String removeAdmin(@RequestParam(value = "adminId")Long adminId,
                              @RequestParam(value="keyword",defaultValue = "") String keyword,
                              @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum
                              ){

        // 获取当前用户信息
        SecurityContext securityContext = SecurityContextHolder.getContext();
        Authentication authentication = securityContext.getAuthentication();
        SecurityAdmin principal = (SecurityAdmin) authentication.getPrincipal();
        Admin admin = principal.getAdmin();

        if (adminId.equals(admin.getId())){
            throw new DeleteCurrentAdminException(CrowdConstant.MESSAGE_DELETE_ADMIN_WARNING);
        }
        adminService.removeAdminById(adminId);
        String view = "redirect:/admin/get/pageInfo.html";
        if ((keyword!=null && keyword.length()!=0)){
            view = "redirect:/admin/get/pageInfo.html?pageNum="+pageNum+"&keyword="+keyword;
        }
        if ((keyword==null || keyword.length()==0)){
            view = "redirect:/admin/get/pageInfo.html?pageNum="+pageNum;
        }
        return view;
    }

    @PreAuthorize("hasAuthority('admin:add')")
    @RequestMapping("/admin/save/pageInfo.html")
    public String saveAdmin(Admin admin,@RequestParam(value = "adminPasswordRepeat")String adminPasswordRepeat,HttpServletRequest request){
        adminService.saveAdmin(admin,adminPasswordRepeat);
        request.setAttribute("adminName",admin.getAdminName());
        return  "success/admin-do-success";
    }

    @PreAuthorize("hasAuthority('admin:update')")
    @RequestMapping("/admin/to/update/page.html")
    public String toUpdatePage(@RequestParam(value = "adminId")Long adminId,HttpServletRequest request){
        Admin admin = adminService.getAdminById(adminId);
        request.setAttribute(CrowdConstant.ATTRIBUTE_ADMIN_NAME,admin);
        return "admin/admin-update";
    }

    @PreAuthorize("hasAuthority('admin:update')")
    @RequestMapping("/admin/update/pageInfo.html")
    public String updateAdmin(Admin admin,HttpServletRequest request){
        adminService.updateAdmin(admin);
        request.setAttribute("adminName",admin.getAdminName());
        return  "success/admin-do-success";
    }
}
