package com.pz.crowd.service.api;

import com.pz.crowd.entity.ProjectVO;
import com.pz.crowd.mapper.ProjectPOMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface AuditService {
    List<ProjectVO> getProjectVOs();
}
