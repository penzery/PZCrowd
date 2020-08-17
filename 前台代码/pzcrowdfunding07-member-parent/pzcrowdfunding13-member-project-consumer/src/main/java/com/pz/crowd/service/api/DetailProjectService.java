package com.pz.crowd.service.api;

import com.pz.crowd.entity.vo.DetailProjectVO;
import com.pz.crowd.util.ResultEntity;

public interface DetailProjectService {
    public DetailProjectVO getDetailProjectVO(Long projectId);
}
