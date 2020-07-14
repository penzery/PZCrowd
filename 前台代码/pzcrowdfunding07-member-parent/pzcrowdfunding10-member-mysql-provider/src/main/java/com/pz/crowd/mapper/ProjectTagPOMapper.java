package com.pz.crowd.mapper;

import com.pz.crowd.entity.po.ProjectTagPO;
import com.pz.crowd.entity.po.ProjectTagPOExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ProjectTagPOMapper {
    long countByExample(ProjectTagPOExample example);

    int deleteByExample(ProjectTagPOExample example);

    int deleteByPrimaryKey(Long tagId);

    int insert(ProjectTagPO record);

    int insertSelective(ProjectTagPO record);

    List<ProjectTagPO> selectByExample(ProjectTagPOExample example);

    ProjectTagPO selectByPrimaryKey(Long tagId);

    int updateByExampleSelective(@Param("record") ProjectTagPO record, @Param("example") ProjectTagPOExample example);

    int updateByExample(@Param("record") ProjectTagPO record, @Param("example") ProjectTagPOExample example);

    int updateByPrimaryKeySelective(ProjectTagPO record);

    int updateByPrimaryKey(ProjectTagPO record);
}