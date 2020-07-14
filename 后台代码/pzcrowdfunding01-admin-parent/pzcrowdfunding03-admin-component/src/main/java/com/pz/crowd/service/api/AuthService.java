package com.pz.crowd.service.api;

import com.pz.crowd.entity.Auth;

import java.util.List;

public interface AuthService {
    List<Auth> getAllAuthList();

    List<Auth> getAssignedAuthList(Long roleId);

    void saveRoleAuthRelationship(Long roleId, List<Long> authIdArray);

    List<String> getAssignedAuthNameListByAdminId(Long adminId);

}
