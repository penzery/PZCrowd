package com.pz.crowd.controller;

import com.pz.crowd.api.CrowdMysqlRemoteService;
import com.pz.crowd.config.OSSProperties;
import com.pz.crowd.constant.CrowdConstant;
import com.pz.crowd.entity.vo.MemberLoginVO;
import com.pz.crowd.entity.vo.ProjectLaunchMemberConfirmInfoVO;
import com.pz.crowd.entity.vo.ProjectReturnInfoVO;
import com.pz.crowd.entity.vo.ProjectVO;
import com.pz.crowd.util.CrowdUtil;
import com.pz.crowd.util.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class CreateProjectController {

    @Autowired
    private OSSProperties ossProperties;

    @Autowired
    private CrowdMysqlRemoteService crowdMysqlRemoteService;

    @RequestMapping("/create/project/information")
    public String getProjectInfo(ProjectVO projectVO,
                                 @RequestParam(value = "headerPicture",required = false) MultipartFile headerPicture,
                                 @RequestParam(value = "detailPictureList",required = false)List<MultipartFile> detailPictureList,
                                 HttpSession session,
                                 HttpServletRequest request) throws IOException {

        boolean empty = headerPicture.isEmpty();
        if (!empty){
            ResultEntity<String> upHeadImgResultEntity = CrowdUtil.uploadFileToOss(ossProperties.getEndPoint(), ossProperties.getAccessKeyId(), ossProperties.getAccessKeySecret(), headerPicture.getInputStream(), ossProperties.getBucketName(), ossProperties.getBucketDomain(), headerPicture.getOriginalFilename());
            if (upHeadImgResultEntity.getResult().equals("SUCCESS")){
                String headImgPath = upHeadImgResultEntity.getData();
                projectVO.setProjectHeaderImgPath(headImgPath);
            }else{
                request.setAttribute("failedMessage","头图上传失败");
                return "project-launch.html";
            }
        }


        List<String> detailImgPathList = new ArrayList<>();
        for (MultipartFile detailPicture:detailPictureList) {
            if (!detailPicture.isEmpty()){

                ResultEntity<String> upDetailImgResultEntity = CrowdUtil.uploadFileToOss(ossProperties.getEndPoint(), ossProperties.getAccessKeyId(), ossProperties.getAccessKeySecret(), detailPicture.getInputStream(), ossProperties.getBucketName(), ossProperties.getBucketDomain(), detailPicture.getOriginalFilename());
                if (upDetailImgResultEntity.getResult().equals("SUCCESS")){
                    String detailImgPath = upDetailImgResultEntity.getData();
                    detailImgPathList.add(detailImgPath);
                }
            }
        }
        projectVO.setProjectDetailedImgPathList(detailImgPathList);


        session.setAttribute("TempProjectVO",projectVO);
        return "redirect:http://localhost:800/project/to/collect/return/info/page.html";
    }

    @ResponseBody
    @RequestMapping("/create/upload/return/picture.json")
    public ResultEntity<String> uploadReturnImg(@RequestParam("returnPicture")MultipartFile returnPicture) throws IOException {
        boolean empty = returnPicture.isEmpty();
        if (!empty){
            ResultEntity<String> upReturnImgResultEntity = CrowdUtil.uploadFileToOss(ossProperties.getEndPoint(), ossProperties.getAccessKeyId(), ossProperties.getAccessKeySecret(), returnPicture.getInputStream(), ossProperties.getBucketName(), ossProperties.getBucketDomain(), returnPicture.getOriginalFilename());
            return upReturnImgResultEntity;
        }else{
            return ResultEntity.failed("图片信息为空");
        }
    }

    @ResponseBody
    @RequestMapping("/create/save/return.json")
    public ResultEntity saveReturnInfo(ProjectReturnInfoVO projectReturnInfoVO,HttpSession session){
        try {
            ProjectVO projectVO = (ProjectVO) session.getAttribute("TempProjectVO");
            if (projectVO==null){
                return ResultEntity.failed("先前保存的项目数据丢失,请重新填写项目及发起人信息");
            }

            List<ProjectReturnInfoVO> projectReturnInfoVOList = projectVO.getProjectReturnInfoVOList();
            if (projectReturnInfoVOList==null||projectReturnInfoVOList.size()==0){
                List<ProjectReturnInfoVO> returnInfoVOList=new ArrayList<>();
                returnInfoVOList.add(projectReturnInfoVO);
                projectVO.setProjectReturnInfoVOList(returnInfoVOList);
            }else{
                projectReturnInfoVOList.add(projectReturnInfoVO);
            }
            session.setAttribute("TempProjectVO",projectVO);
            return ResultEntity.successWithoutData();
        } catch (Exception e) {
            return ResultEntity.failed(e.getMessage());
        }
    }

    @ResponseBody
    @RequestMapping("/create/confirm")
    public String saveConfirm(ProjectLaunchMemberConfirmInfoVO projectLaunchMemberConfirmInfoVO,HttpSession session,HttpServletRequest request){
        ProjectVO projectVO = (ProjectVO) session.getAttribute("TempProjectVO");
        if (projectVO==null){
            request.setAttribute("failedMessage","先前保存的项目数据丢失,请重新填写项目及发起人信息");
            return "project-confirm";
        }
        projectVO.setProjectLaunchMemberConfirmInfoVO(projectLaunchMemberConfirmInfoVO);
        MemberLoginVO attribute = (MemberLoginVO) session.getAttribute(CrowdConstant.ATTRIBUTE_SESSION_MEMBER_VO);
        projectVO.getProjectLaunchMemberInfoVO().setMemberId(attribute.getMemberId());
        projectVO.setProjectCreatedate(new Date());
        ResultEntity resultEntity = crowdMysqlRemoteService.saveProjectVORemote(projectVO);
        return resultEntity.getResult();
    }

}
