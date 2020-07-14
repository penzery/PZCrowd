package com.pz.crowd.mapper;

import com.pz.crowd.entity.RoleExample;
import org.apache.ibatis.annotations.Param;

import com.pz.crowd.entity.Role;
import java.util.List;

public interface RoleMapper {
    long countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    List<Role> selectByKeyword(String keyword);

    List<Role> selectAssignedRole(Long adminId);

    List<Role> selectUnassignedRole(Long adminId);

    void deleteOldAdminRoleRelationship(Long adminId);

    void insertNewAdminRoleRelationship(@Param("adminId") Long adminId,@Param("roleIdList") List<Long> roleIdList);

    List<String> selectAssignedRoleName(Long adminId);
}