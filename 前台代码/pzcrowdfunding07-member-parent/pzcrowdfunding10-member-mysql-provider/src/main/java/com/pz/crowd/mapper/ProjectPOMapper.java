package com.pz.crowd.mapper;

import com.pz.crowd.entity.po.ProjectPO;
import com.pz.crowd.entity.po.ProjectPOExample;
import com.pz.crowd.entity.vo.DetailProjectVO;
import com.pz.crowd.entity.vo.DetailReturnVO;
import com.pz.crowd.entity.vo.PortalProjectTypeVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
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

    List<PortalProjectTypeVO> selectPortalProjectTypeVOList();

    DetailProjectVO selectDetailProjectVO(Long projectId);

}