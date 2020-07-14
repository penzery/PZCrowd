package com.pz.crowd.mapper;

import com.pz.crowd.entity.po.ProjectLaunchMemberInfoPO;
import com.pz.crowd.entity.po.ProjectLaunchMemberInfoPOExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ProjectLaunchMemberInfoPOMapper {
    long countByExample(ProjectLaunchMemberInfoPOExample example);

    int deleteByExample(ProjectLaunchMemberInfoPOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProjectLaunchMemberInfoPO record);

    int insertSelective(ProjectLaunchMemberInfoPO record);

    List<ProjectLaunchMemberInfoPO> selectByExample(ProjectLaunchMemberInfoPOExample example);

    ProjectLaunchMemberInfoPO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProjectLaunchMemberInfoPO record, @Param("example") ProjectLaunchMemberInfoPOExample example);

    int updateByExample(@Param("record") ProjectLaunchMemberInfoPO record, @Param("example") ProjectLaunchMemberInfoPOExample example);

    int updateByPrimaryKeySelective(ProjectLaunchMemberInfoPO record);

    int updateByPrimaryKey(ProjectLaunchMemberInfoPO record);
}