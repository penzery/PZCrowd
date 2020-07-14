package com.pz.crowd.mapper;

import com.pz.crowd.entity.ProjectPO;
import com.pz.crowd.entity.ProjectPOExample;

import com.pz.crowd.entity.ProjectVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface ProjectPOMapper {
    long countByExample(ProjectPOExample example);

    int deleteByExample(ProjectPOExample example);

    int deleteByPrimaryKey(Long projectId);

    int insert(ProjectPO record);

    int insertProjectTypeRelationship(@Param("typeIdList")List<Long> typeIdList,@Param("projectId")Long projectId);

    int insertProjectTagRelationship(@Param("tagIdList")List<Long> tagIdList,@Param("projectId") Long projectId);

    int insertSelective(ProjectPO record);

    List<ProjectPO> selectByExample(ProjectPOExample example);

    ProjectPO selectByPrimaryKey(Long projectId);

    int updateByExampleSelective(@Param("record") ProjectPO record, @Param("example") ProjectPOExample example);

    int updateByExample(@Param("record") ProjectPO record, @Param("example") ProjectPOExample example);

    int updateByPrimaryKeySelective(ProjectPO record);

    int updateByPrimaryKey(ProjectPO record);

    List<ProjectVO> selectProjectVO();


}