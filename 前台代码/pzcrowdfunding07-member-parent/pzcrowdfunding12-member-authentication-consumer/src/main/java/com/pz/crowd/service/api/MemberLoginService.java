package com.pz.crowd.service.api;

import com.pz.crowd.entity.vo.MemberLoginVO;

public interface MemberLoginService {
    public MemberLoginVO doLogin(String memberAccount, String memberPassword);
}
