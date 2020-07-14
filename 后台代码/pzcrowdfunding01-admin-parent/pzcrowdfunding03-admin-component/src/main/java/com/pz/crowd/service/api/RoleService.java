package com.pz.crowd.service.api;

import com.github.pagehelper.PageInfo;
import com.pz.crowd.entity.Role;

import java.util.List;

public interface RoleService {
    PageInfo<Role> getPageInfo(Integer pageNum,Integer pageSize,String keyword);

    void saveRole(String roleName);

    void updateRole(Role role);

    void removeRoleByIdList(List<Long> idList);

    List<Role> getAssignedRole(Long adminId);

    List<String> getAssignedRoleName(Long adminId);

    List<Role> getUnassignedRole(Long adminId);

    void removeOldAdminRoleRelationship(Long adminId);

    void saveNewAdminRoleRelationship(Long adminId,List<Long> roleIdList);

}
