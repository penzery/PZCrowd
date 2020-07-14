package com.pz.crowd.mapper;

import com.pz.crowd.entity.po.ProjectDetailedImgPO;
import com.pz.crowd.entity.po.ProjectDetailedImgPOExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProjectDetailedImgPOMapper {
    long countByExample(ProjectDetailedImgPOExample example);

    int deleteByExample(ProjectDetailedImgPOExample example);

    int deleteByPrimaryKey(Long imgId);

    int insertMore(@Param("projectId")Long projectId,@Param("imgPathList")List<String> imgPathList);

    int insert(ProjectDetailedImgPO record);

    int insertSelective(ProjectDetailedImgPO record);

    List<ProjectDetailedImgPO> selectByExample(ProjectDetailedImgPOExample example);

    ProjectDetailedImgPO selectByPrimaryKey(Long imgId);

    int updateByExampleSelective(@Param("record") ProjectDetailedImgPO record, @Param("example") ProjectDetailedImgPOExample example);

    int updateByExample(@Param("record") ProjectDetailedImgPO record, @Param("example") ProjectDetailedImgPOExample example);

    int updateByPrimaryKeySelective(ProjectDetailedImgPO record);

    int updateByPrimaryKey(ProjectDetailedImgPO record);
}