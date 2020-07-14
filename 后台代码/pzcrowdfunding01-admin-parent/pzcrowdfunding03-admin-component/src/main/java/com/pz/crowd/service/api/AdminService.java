package com.pz.crowd.service.api;

import com.github.pagehelper.PageInfo;
import com.pz.crowd.entity.Admin;

import java.util.List;

public interface AdminService {
    void saveAdmin(Admin admin);

    List<Admin> getAll();

    Admin getAdminById(Long id);

    Admin getAdminByAccount(String account);

    PageInfo<Admin> getPageInfo(String keyword,Integer pageNum,Integer pageSize);

    void removeAdminById(Long adminId);

    void saveAdmin(Admin admin,String adminPasswordRepeat);

    void updateAdmin(Admin admin);

}
