package com.pz.crowd.mapper;

import com.pz.crowd.entity.Auth;
import com.pz.crowd.entity.AuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthMapper {
    long countByExample(AuthExample example);

    int deleteByExample(AuthExample example);

    int deleteByPrimaryKey(Long authId);

    int insert(Auth record);

    int insertSelective(Auth record);

    List<Auth> selectByExample(AuthExample example);

    Auth selectByPrimaryKey(Long authId);

    int updateByExampleSelective(@Param("record") Auth record, @Param("example") AuthExample example);

    int updateByExample(@Param("record") Auth record, @Param("example") AuthExample example);

    int updateByPrimaryKeySelective(Auth record);

    int updateByPrimaryKey(Auth record);

    List<Auth> selectAssignedAuth(Long roleId);

    void insertRoleAuthRelationship(@Param("roleId")Long roleId,@Param("authIdList")List<Long> authIdList);

    void deleteOldRoleAuthRelationship(Long roleId);

    List<String> selectAssignedAuthNameByAdminId(Long adminId);
}