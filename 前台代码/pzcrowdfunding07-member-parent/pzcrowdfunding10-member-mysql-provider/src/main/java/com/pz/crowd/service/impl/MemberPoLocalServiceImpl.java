package com.pz.crowd.service.impl;

import com.pz.crowd.constant.CrowdConstant;
import com.pz.crowd.entity.po.MemberPO;
import com.pz.crowd.entity.po.MemberPOExample;
import com.pz.crowd.mapper.MemberPOMapper;
import com.pz.crowd.service.api.MemberPOLocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MemberPoLocalServiceImpl implements MemberPOLocalService {
    @Autowired
    private MemberPOMapper memberPOMapper;

    @Transactional(readOnly = true)
    @Override
    public MemberPO getMemberPOByMemberAccount(String memberAccount) {
        MemberPOExample memberPOExample = new MemberPOExample();
        MemberPOExample.Criteria criteria = memberPOExample.createCriteria();
        criteria.andMemberAccountEqualTo(memberAccount);
        List<MemberPO> memberPOList = memberPOMapper.selectByExample(memberPOExample);
        if (memberPOList.size()==0){
            throw new RuntimeException(CrowdConstant.MESSAGE_ACCOUNT_NOT_EXISTS);
        }
        MemberPO memberPO = memberPOList.get(0);
        return memberPO;
    }

    @Transactional(readOnly = true)
    @Override
    public Boolean judgeMemberAccountUseful(String memberAccount) {
        MemberPOExample memberPOExample = new MemberPOExample();
        MemberPOExample.Criteria criteria = memberPOExample.createCriteria();
        criteria.andMemberAccountEqualTo(memberAccount);
        List<MemberPO> memberPOList = memberPOMapper.selectByExample(memberPOExample);
        if (memberPOList.size()==0){
            return true;
        }
        return false;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW,rollbackFor = Exception.class)
    @Override
    public void saveMemberPO(MemberPO memberPO) {
        memberPOMapper.insertSelective(memberPO);
    }
}
