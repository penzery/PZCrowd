package com.pz.crowd.service.api;

import com.pz.crowd.entity.vo.DetailProjectVO;
import com.pz.crowd.entity.vo.PortalProjectTypeVO;
import com.pz.crowd.entity.vo.ProjectVO;
import com.pz.crowd.util.ResultEntity;

import java.util.List;

public interface ProjectPOLocalService {
    public ResultEntity saveProjectVO(ProjectVO projectVO);

    public ResultEntity<List<PortalProjectTypeVO>> getPortalProjectTypeVOList();

    public ResultEntity<DetailProjectVO> getDetailProjectVOById(Long projectId);
}
