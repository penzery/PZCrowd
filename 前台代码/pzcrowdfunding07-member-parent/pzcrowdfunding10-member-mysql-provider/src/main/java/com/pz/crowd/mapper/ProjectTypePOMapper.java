package com.pz.crowd.mapper;

import com.pz.crowd.entity.po.ProjectTypePO;
import com.pz.crowd.entity.po.ProjectTypePOExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ProjectTypePOMapper {
    long countByExample(ProjectTypePOExample example);

    int deleteByExample(ProjectTypePOExample example);

    int deleteByPrimaryKey(Long typeId);

    int insert(ProjectTypePO record);

    int insertSelective(ProjectTypePO record);

    List<ProjectTypePO> selectByExample(ProjectTypePOExample example);

    ProjectTypePO selectByPrimaryKey(Long typeId);

    int updateByExampleSelective(@Param("record") ProjectTypePO record, @Param("example") ProjectTypePOExample example);

    int updateByExample(@Param("record") ProjectTypePO record, @Param("example") ProjectTypePOExample example);

    int updateByPrimaryKeySelective(ProjectTypePO record);

    int updateByPrimaryKey(ProjectTypePO record);
}