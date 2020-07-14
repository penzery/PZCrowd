package com.pz.crowd.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pz.crowd.constant.CrowdConstant;
import com.pz.crowd.entity.Admin;
import com.pz.crowd.entity.AdminExample;
import com.pz.crowd.exception.LoginFailedException;
import com.pz.crowd.exception.SaveAdminFailedException;
import com.pz.crowd.exception.UpdateAdminFailedException;
import com.pz.crowd.mapper.AdminMapper;
import com.pz.crowd.service.api.AdminService;
import com.pz.crowd.util.CrowdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void saveAdmin(Admin admin) {
        adminMapper.insert(admin);
    }

    @Override
    public List<Admin> getAll() {
        //给定空的AdminExample就是查询全部
        return adminMapper.selectByExample(new AdminExample());
    }


    @Override
    public PageInfo<Admin> getPageInfo(String keyword, Integer pageNum, Integer pageSize) {
        // 调用PageHelper的静态方法开启分页功能
        PageHelper.startPage(pageNum,pageSize);
        // 执行查询  原本的查询不需要修改
        List<Admin> adminList = adminMapper.selectAdminForPageInfo(keyword);
        // 封装到pageInfo对象中
        return new PageInfo<>(adminList);
    }

    @Override
    public void removeAdminById(Long adminId) {
        adminMapper.deleteByPrimaryKey(adminId);
    }


    @Override
    public Admin getAdminById(Long id) {
        Admin admin = adminMapper.selectByPrimaryKey(id);
        return admin;
    }

    @Override
    public void updateAdmin(Admin admin) {
        try {
            adminMapper.updateByPrimaryKeySelective(admin);
        }catch (Exception e){
            throw new UpdateAdminFailedException(CrowdConstant.MESSAGE_ADMIN_ACCT_ALREADY_IN_USE);
        }
    }


    // 根据用户账号查询对应的用户信息，Spring-Security验证登录时使用
    @Override
    public Admin getAdminByAccount(String account) {
        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();
        criteria.andAdminAccountEqualTo(account);
        List<Admin> adminList = adminMapper.selectByExample(example);
        Admin admin = adminList.get(0);
        return admin;
    }

    // 用于保存新的用户信息
    @Override
    public void saveAdmin(Admin admin, String adminPasswordRepeat) {
        if (admin.getAdminAccount()==null || admin.getAdminAccount().length()==0){
            throw new SaveAdminFailedException(CrowdConstant.MESSAGE_SAVE_EMPTY_ACCOUNT_WARNING);
        }
        if (admin.getAdminPassword()==null ||admin.getAdminPassword().length()==0){
            throw new SaveAdminFailedException(CrowdConstant.MESSAGE_SAVE_EMPTY_PASSWORD_WARNING);
        }
        if (adminPasswordRepeat==null ||adminPasswordRepeat.length()==0){
            throw new SaveAdminFailedException(CrowdConstant.MESSAGE_SAVE_EMPTY_PASSWORD_REPEAT_WARNING);
        }
        if (admin.getAdminName()==null ||admin.getAdminName().length()==0){
            throw new SaveAdminFailedException(CrowdConstant.MESSAGE_SAVE_EMPTY_NAME_WARNING);
        }
        if (admin.getAdminEmail()==null ||admin.getAdminEmail().length()==0){
            throw new SaveAdminFailedException(CrowdConstant.MESSAGE_SAVE_EMPTY_EMAIL_WARNING);
        }
        if (!admin.getAdminPassword().equals(adminPasswordRepeat)){
            throw new SaveAdminFailedException(CrowdConstant.MESSAGE_SAVE_PASSWORD_UNEQUAL_WARNING);
        }

        String password = bCryptPasswordEncoder.encode(adminPasswordRepeat);
        admin.setAdminPassword(password);
        admin.setCreateTime(new Date());
        try {
            adminMapper.insert(admin);
        }catch (Exception e){
            throw new SaveAdminFailedException(CrowdConstant.MESSAGE_ADMIN_ACCT_ALREADY_IN_USE);
        }


    }


}
