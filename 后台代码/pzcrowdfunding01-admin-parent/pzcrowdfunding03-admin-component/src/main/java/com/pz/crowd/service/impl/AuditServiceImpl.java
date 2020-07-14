package com.pz.crowd.service.impl;

import com.pz.crowd.entity.ProjectVO;
import com.pz.crowd.mapper.ProjectPOMapper;
import com.pz.crowd.service.api.AuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AuditServiceImpl implements AuditService {
    @Autowired
    private ProjectPOMapper projectPOMapper;
    @Override
    public List<ProjectVO> getProjectVOs() {
        List<ProjectVO> projectVOS = projectPOMapper.selectProjectVO();
        return projectVOS;
    }
}
