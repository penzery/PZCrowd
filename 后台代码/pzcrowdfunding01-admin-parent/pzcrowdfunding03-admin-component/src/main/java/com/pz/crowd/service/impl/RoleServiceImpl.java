package com.pz.crowd.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pz.crowd.constant.CrowdConstant;
import com.pz.crowd.entity.Role;
import com.pz.crowd.entity.RoleExample;
import com.pz.crowd.exception.DoRoleException;
import com.pz.crowd.mapper.RoleMapper;
import com.pz.crowd.service.api.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleMapper roleMapper;

    @Override
    public PageInfo<Role> getPageInfo(Integer pageNum, Integer pageSize, String keyword) {

        PageHelper.startPage(pageNum,pageSize);

        List<Role> roles = roleMapper.selectByKeyword(keyword);

        return new PageInfo<>(roles);
    }

    @Override
    public void saveRole(String roleName) {
        if (roleName ==null || roleName.length()==0){
            throw new DoRoleException(CrowdConstant.MESSAGE_SAVE_EMPTY_ROLE_NAME_WARNING);
        }
        Role role = new Role(null,roleName);
        try {
            roleMapper.insert(role);
        }catch (Exception e){
            throw new DoRoleException(CrowdConstant.MESSAGE_ROLE_NAME_ALREADY_IN_USE);
        }

    }

    @Override
    public void updateRole(Role role) {
        if (role.getRoleName() ==null || role.getRoleName().length()==0){
            throw new DoRoleException(CrowdConstant.MESSAGE_SAVE_EMPTY_ROLE_NAME_WARNING);
        }
        try {
            roleMapper.updateByPrimaryKey(role);
        }catch (Exception e){
            throw new DoRoleException(CrowdConstant.MESSAGE_ROLE_NAME_ALREADY_IN_USE);
        }

    }

    @Override
    public void removeRoleByIdList(List<Long> idList) {
        if (idList == null || idList.size()==0){
            throw new DoRoleException(CrowdConstant.MESSAGE_DELETE_EMPTY_ROLE_ID_WARNING);
        }
        RoleExample example = new RoleExample();
        RoleExample.Criteria criteria = example.createCriteria();

        criteria.andIdIn(idList);

        roleMapper.deleteByExample(example);
    }




    //assignController


    @Override
    public List<Role> getAssignedRole(Long adminId) {
        List<Role> assignedRole = roleMapper.selectAssignedRole(adminId);
        return assignedRole;
    }

    @Override
    public List<Role> getUnassignedRole(Long adminId) {
        List<Role> unassignedRole = roleMapper.selectUnassignedRole(adminId);
        return unassignedRole;
    }

    @Override
    public void removeOldAdminRoleRelationship(Long adminId) {
        roleMapper.deleteOldAdminRoleRelationship(adminId);
    }

    @Override
    public void saveNewAdminRoleRelationship(Long adminId, List<Long> roleIdList) {
        if (roleIdList!=null && roleIdList.size()>0){
            roleMapper.insertNewAdminRoleRelationship(adminId,roleIdList);
        }
    }

    @Override
    public List<String> getAssignedRoleName(Long adminId) {
        List<String> assignedRoleNameList = roleMapper.selectAssignedRoleName(adminId);
        return assignedRoleNameList;
    }
}
