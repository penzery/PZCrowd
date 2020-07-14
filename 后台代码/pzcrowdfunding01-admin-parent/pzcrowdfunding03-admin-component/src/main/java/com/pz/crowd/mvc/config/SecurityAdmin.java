package com.pz.crowd.mvc.config;

import com.pz.crowd.entity.Admin;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.List;

public class SecurityAdmin extends User {

    private Admin admin;

    public SecurityAdmin(Admin admin, List<GrantedAuthority> grantedAuthorities) {
        super(admin.getAdminAccount(), admin.getAdminPassword(), grantedAuthorities);
        admin.setAdminPassword(null);
        this.admin=admin;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}
