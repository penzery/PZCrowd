package com.pz.crowd.mvc.config;

import com.pz.crowd.entity.Admin;
import com.pz.crowd.mvc.config.SecurityAdmin;
import com.pz.crowd.service.api.AdminService;
import com.pz.crowd.service.api.AuthService;
import com.pz.crowd.service.api.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private AdminService adminService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private AuthService authService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Admin admin = adminService.getAdminByAccount(s);
        Long adminId = admin.getId();

        List<String> assignedRoleNameList = roleService.getAssignedRoleName(adminId);
        List<String> assignedAuthNameList = authService.getAssignedAuthNameListByAdminId(adminId);

        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        for (String assignedRoleName:assignedRoleNameList){
            grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_"+assignedRoleName));
        }
        for (String assignedAuthName:assignedAuthNameList){
            grantedAuthorities.add(new SimpleGrantedAuthority(assignedAuthName));
        }
        SecurityAdmin securityAdmin = new SecurityAdmin(admin,grantedAuthorities);

        return securityAdmin;
    }
}
