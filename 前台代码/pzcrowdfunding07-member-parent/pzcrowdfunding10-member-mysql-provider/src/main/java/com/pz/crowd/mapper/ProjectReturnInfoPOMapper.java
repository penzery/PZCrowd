package com.pz.crowd.mapper;

import com.pz.crowd.entity.po.ProjectReturnInfoPO;
import com.pz.crowd.entity.po.ProjectReturnInfoPOExample;
import com.pz.crowd.entity.vo.DetailReturnVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ProjectReturnInfoPOMapper {
    long countByExample(ProjectReturnInfoPOExample example);

    int deleteByExample(ProjectReturnInfoPOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ProjectReturnInfoPO record);

    int insertSelective(ProjectReturnInfoPO record);

    List<ProjectReturnInfoPO> selectByExample(ProjectReturnInfoPOExample example);

    ProjectReturnInfoPO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ProjectReturnInfoPO record, @Param("example") ProjectReturnInfoPOExample example);

    int updateByExample(@Param("record") ProjectReturnInfoPO record, @Param("example") ProjectReturnInfoPOExample example);

    int updateByPrimaryKeySelective(ProjectReturnInfoPO record);

    int updateByPrimaryKey(ProjectReturnInfoPO record);

    List<DetailReturnVO> selectDetailReturnVOList(Long projectId);
}