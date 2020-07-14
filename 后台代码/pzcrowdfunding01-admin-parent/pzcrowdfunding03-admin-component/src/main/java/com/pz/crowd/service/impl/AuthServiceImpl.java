package com.pz.crowd.service.impl;

import com.pz.crowd.entity.Auth;
import com.pz.crowd.entity.AuthExample;
import com.pz.crowd.mapper.AuthMapper;
import com.pz.crowd.service.api.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    AuthMapper authMapper;

    @Override
    public List<Auth> getAllAuthList() {
        AuthExample example = new AuthExample();
        return authMapper.selectByExample(example);
    }

    @Override
    public List<Auth> getAssignedAuthList(Long roleId) {
        List<Auth> auths = authMapper.selectAssignedAuth(roleId);
        return auths;
    }

    @Override
    public void saveRoleAuthRelationship(Long roleId, List<Long> authIdArray) {
        authMapper.deleteOldRoleAuthRelationship(roleId);
        if (authIdArray!=null && authIdArray.size()>0){
            authMapper.insertRoleAuthRelationship(roleId,authIdArray);
        }
    }

    @Override
    public List<String> getAssignedAuthNameListByAdminId(Long adminId) {
        List<String> authNameList =authMapper.selectAssignedAuthNameByAdminId(adminId);
        return authNameList;
    }
}
