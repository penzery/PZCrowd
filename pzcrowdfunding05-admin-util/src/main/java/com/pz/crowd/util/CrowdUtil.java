package com.pz.crowd.util;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.common.comm.ResponseMessage;
import com.aliyun.oss.model.PutObjectResult;
import com.pz.crowd.constant.CrowdConstant;

import javax.servlet.http.HttpServletRequest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class CrowdUtil {

    /**
     * 专门负责上传文件到 OSS 服务器的工具方法 * @param endpoint OSS 参数
     * @param accessKeyId OSS 参数 *@paramaccessKeySecret OSS参数
     * @param inputStream
     * @param bucketName
     * @param bucketDomain
     * @param originalName
     * @return 包含上传结果以及上传的文件在 OSS 上的访问路径 */
    public static ResultEntity<String> uploadFileToOss(String endpoint,
                                                       String accessKeyId,
                                                       String accessKeySecret,
                                                       InputStream inputStream,
                                                       String bucketName,
                                                       String bucketDomain,
                                                       String originalName) {
        // 创建 OSSClient 实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        // 生成上传文件的目录
        String folderName = new SimpleDateFormat("yyyyMMdd").format(new Date());
        // 生成上传文件在 OSS 服务器上保存时的文件名
        // 原始文件名:beautfulgirl.jpg
        // 生成文件名:wer234234efwer235346457dfswet346235.jpg
        // 使用 UUID 生成文件主体名称
        String fileMainName = UUID.randomUUID().toString().replace("-", "");
        // 从原始文件名中获取文件扩展名
        String extensionName = originalName.substring(originalName.lastIndexOf("."));
        // 使用目录、文件主体名称、文件扩展名称拼接得到对象名称
        String objectName = folderName + "/" + fileMainName + extensionName;
        try {
        // 调用 OSS 客户端对象的方法上传文件并获取响应结果数据
            PutObjectResult putObjectResult = ossClient.putObject(bucketName, objectName,
                    inputStream);
        // 从响应结果中获取具体响应消息
            ResponseMessage responseMessage = putObjectResult.getResponse();
        // 根据响应状态码判断请求是否成功
            if(responseMessage == null) {
        // 拼接访问刚刚上传的文件的路径
            String ossFileAccessPath = bucketDomain + "/" + objectName;
        // 当前方法返回成功
            return ResultEntity.successWithData(ossFileAccessPath);
        }
        else {
        // 获取响应状态码
            int statusCode = responseMessage.getStatusCode();
            // 如果请求没有成功，获取错误消息
            String errorMessage = responseMessage.getErrorResponseAsString();
// 当前方法返回失败
            return ResultEntity.failed(" 当 前 响 应 状 态 码 ="+statusCode+" 错 误 消 息 ="+errorMessage);
        }
        } catch (Exception e) {
            e.printStackTrace();
            // 当前方法返回失败
            return ResultEntity.failed(e.getMessage());
        } finally {
            if(ossClient != null) {
                // 关闭 OSSClient。
            ossClient.shutdown();
            }
        }
    }

    public static String sendCordMessage(String memberPhoneNum){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int random = (int) (Math.random()*10);
            builder.append(random);
        }
        return builder.toString();
    }

    //返回true代表是ajax请求，否则是html请求
    public static boolean judgeRequestType(HttpServletRequest request){
        String xrw;
        boolean xrwb=false;
        if((xrw=request.getHeader("X-Requested-With"))!=null){
            xrwb=xrw.equals("XMLHttpRequest");
        }
        return request.getHeader("Accept").contains("application/json")||xrwb;
    }

    public static String md5(String source){
        if (source == null || source.length() == 0){
            throw new RuntimeException(CrowdConstant.MESSAGE_PASSWORD_INVALIDATE);
        }
        try {
            String algorithm="md5";
            //MessageDigest获得一个对象传入要使用的加密算法名
            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            // 使用digest方法进行加密，传入字节数组
            byte[] input = source.getBytes();
            byte[] output = messageDigest.digest(input);
            // 将字节数组转为String
            int signum = 1;
            BigInteger bigInteger = new BigInteger(signum,output);
            // 按照16进制将BigInteger的值转换为字符串
            int radix=16;
            String encoded = bigInteger.toString(radix).toUpperCase();

            return  encoded;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}
