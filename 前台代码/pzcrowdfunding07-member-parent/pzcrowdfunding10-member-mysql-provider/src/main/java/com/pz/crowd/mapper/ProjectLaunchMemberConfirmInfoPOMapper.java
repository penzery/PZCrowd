package com.pz.crowd.mapper;

import com.pz.crowd.entity.po.ProjectLaunchMemberConfirmInfoPO;
import com.pz.crowd.entity.po.ProjectLaunchMemberConfirmInfoPOExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ProjectLaunchMemberConfirmInfoPOMapper {
    long countByExample(ProjectLaunchMemberConfirmInfoPOExample example);

    int deleteByExample(ProjectLaunchMemberConfirmInfoPOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProjectLaunchMemberConfirmInfoPO record);

    int insertSelective(ProjectLaunchMemberConfirmInfoPO record);

    List<ProjectLaunchMemberConfirmInfoPO> selectByExample(ProjectLaunchMemberConfirmInfoPOExample example);

    ProjectLaunchMemberConfirmInfoPO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProjectLaunchMemberConfirmInfoPO record, @Param("example") ProjectLaunchMemberConfirmInfoPOExample example);

    int updateByExample(@Param("record") ProjectLaunchMemberConfirmInfoPO record, @Param("example") ProjectLaunchMemberConfirmInfoPOExample example);

    int updateByPrimaryKeySelective(ProjectLaunchMemberConfirmInfoPO record);

    int updateByPrimaryKey(ProjectLaunchMemberConfirmInfoPO record);
}