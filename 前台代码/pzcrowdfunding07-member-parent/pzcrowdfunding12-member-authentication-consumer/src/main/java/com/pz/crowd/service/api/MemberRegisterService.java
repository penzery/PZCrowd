package com.pz.crowd.service.api;

import com.pz.crowd.entity.vo.MemberVO;

public interface MemberRegisterService {
    void sendCordMessage(String memberPhoneNum);
    void registerMember(MemberVO memberVO);
}
