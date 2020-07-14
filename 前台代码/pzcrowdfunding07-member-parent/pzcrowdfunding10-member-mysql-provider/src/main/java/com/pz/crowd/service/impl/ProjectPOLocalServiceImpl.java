package com.pz.crowd.service.impl;

import com.pz.crowd.entity.po.ProjectLaunchMemberConfirmInfoPO;
import com.pz.crowd.entity.po.ProjectLaunchMemberInfoPO;
import com.pz.crowd.entity.po.ProjectPO;
import com.pz.crowd.entity.po.ProjectReturnInfoPO;
import com.pz.crowd.entity.vo.*;
import com.pz.crowd.mapper.*;
import com.pz.crowd.service.api.ProjectPOLocalService;
import com.pz.crowd.util.ResultEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

@Service
public class ProjectPOLocalServiceImpl implements ProjectPOLocalService {

    @Autowired
    private ProjectPOMapper projectPOMapper;

    @Autowired
    private ProjectDetailedImgPOMapper projectDetailedImgPOMapper;

    @Autowired
    private ProjectLaunchMemberInfoPOMapper projectLaunchMemberInfoPOMapper;

    @Autowired
    private ProjectReturnInfoPOMapper projectReturnInfoPOMapper;

    @Autowired
    private ProjectLaunchMemberConfirmInfoPOMapper projectLaunchMemberConfirmInfoPOMapper;

    @Transactional(propagation = Propagation.REQUIRES_NEW,rollbackFor = Exception.class)
    @Override
    public ResultEntity saveProjectVO(ProjectVO projectVO) {

        try {
            // projectPO要存储
            ProjectPO projectPO = new ProjectPO();
            BeanUtils.copyProperties(projectVO,projectPO);

            ProjectLaunchMemberInfoVO projectLaunchMemberInfoVO = projectVO.getProjectLaunchMemberInfoVO();
            projectPO.setProjectMemberId(projectLaunchMemberInfoVO.getMemberId());

            projectPO.setProjectStatus(0);
            projectPO.setProjectSupportMoney((long) 0);
            projectPO.setProjectSupporter(0);
            projectPO.setProjectCompletion(0);
            projectPO.setProjectFollower(0);


            Date projectCreatedate = projectPO.getProjectCreatedate();
            Integer projectFundingDay = projectPO.getProjectFundingDay();
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(projectCreatedate);
            calendar.add(Calendar.DATE,projectFundingDay);
            Date deployDate = calendar.getTime();
            projectPO.setProjectDeploydate(deployDate);



            projectPOMapper.insertSelective(projectPO);

            Long projectId = projectPO.getProjectId();

            //保存Typeidlist
            List<Long> typeIdList = projectVO.getTypeIdList();

            projectPOMapper.insertProjectTypeRelationship(typeIdList,projectId);

            //保存tagIdList
            List<Long> tagIdList = projectVO.getTagIdList();
            projectPOMapper.insertProjectTagRelationship(tagIdList,projectId);

            //保存详情图片路径 一对多
            List<String> projectDetailedImgPathList = projectVO.getProjectDetailedImgPathList();
            projectDetailedImgPOMapper.insertMore(projectId,projectDetailedImgPathList);

            ProjectLaunchMemberInfoPO projectLaunchMemberInfoPO=new ProjectLaunchMemberInfoPO();
            BeanUtils.copyProperties(projectLaunchMemberInfoVO,projectLaunchMemberInfoPO);
            projectLaunchMemberInfoPO.setProjectId(projectId);

            projectLaunchMemberInfoPOMapper.insert(projectLaunchMemberInfoPO);

            List<ProjectReturnInfoVO> projectReturnInfoVOList = projectVO.getProjectReturnInfoVOList();
            for (ProjectReturnInfoVO projectReturnInfoVO:projectReturnInfoVOList){
                Integer signalPurchase = projectReturnInfoVO.getSignalPurchase();
                if (signalPurchase.equals(0)){
                    projectReturnInfoVO.setPurchase(null);
                }
                ProjectReturnInfoPO projectReturnInfoPO=new ProjectReturnInfoPO();
                BeanUtils.copyProperties(projectReturnInfoVO,projectReturnInfoPO);
                projectReturnInfoPO.setProjectId(projectId);

                projectReturnInfoPOMapper.insert(projectReturnInfoPO);
            }

            ProjectLaunchMemberConfirmInfoVO projectLaunchMemberConfirmInfoVO = projectVO.getProjectLaunchMemberConfirmInfoVO();
            ProjectLaunchMemberConfirmInfoPO projectLaunchMemberConfirmInfoPO = new ProjectLaunchMemberConfirmInfoPO();
            BeanUtils.copyProperties(projectLaunchMemberConfirmInfoVO,projectLaunchMemberConfirmInfoPO);
            projectLaunchMemberConfirmInfoPO.setMemberId(projectLaunchMemberInfoVO.getMemberId());

            projectLaunchMemberConfirmInfoPOMapper.insert(projectLaunchMemberConfirmInfoPO);

            return ResultEntity.successWithoutData();
        } catch (BeansException e) {
            return ResultEntity.failed(e.getMessage());
        }
    }

    @Transactional(readOnly = true)
    @Override
    public ResultEntity<List<PortalProjectTypeVO>> getPortalProjectTypeVOList() {
        try {
            List<PortalProjectTypeVO> portalProjectTypeVOS = projectPOMapper.selectPortalProjectTypeVOList();
            return ResultEntity.successWithData(portalProjectTypeVOS);
        } catch (Exception e) {
            return ResultEntity.failed(e.getMessage());
        }
    }

    @Override
    public ResultEntity<DetailProjectVO> getDetailProjectVOById(Long projectId) {
        try {
            DetailProjectVO detailProjectVO = projectPOMapper.selectDetailProjectVO(projectId);
            return ResultEntity.successWithData(detailProjectVO);
        } catch (Exception e) {
            return ResultEntity.failed(e.getMessage());
        }
    }
}
