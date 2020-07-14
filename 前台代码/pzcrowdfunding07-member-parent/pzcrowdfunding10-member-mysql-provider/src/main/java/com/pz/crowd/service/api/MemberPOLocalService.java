package com.pz.crowd.service.api;

import com.pz.crowd.entity.po.MemberPO;

public interface MemberPOLocalService {
    public MemberPO getMemberPOByMemberAccount(String memberAccount);

    public Boolean judgeMemberAccountUseful(String memberAccount);

    public void saveMemberPO(MemberPO memberPO);
}
