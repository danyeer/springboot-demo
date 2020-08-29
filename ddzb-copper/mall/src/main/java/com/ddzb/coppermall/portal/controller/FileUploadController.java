package com.ddzb.coppermall.portal.controller;

import com.ddzb.coppermall.common.api.CommonResult;
import com.ddzb.coppermall.portal.util.CompressPic;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 文件上传
 */
@Controller
@RequestMapping("/upload")
@Api(tags = "01图片工具", description = "单个or批量上传图片/文件")
public class FileUploadController {
    private static final Logger LOGGER = LoggerFactory.getLogger(FileUploadController.class);

    @Value("${file.filePath}")
    private String filePath;



    @ApiOperation("单个文件(图片)上传")
    @RequestMapping(value = "/singleUpload", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult singleUpload(@RequestParam("file") MultipartFile file, String id) {
        if (file.isEmpty()) {
            return CommonResult.validateFailed("上传失败，请选择文件");
        }
        String fileName = file.getOriginalFilename();
        String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);

//        String thumbPath = filePath + "thumb"+File.separator ;
//        String originalPath = filePath + "original"+File.separator ;
        String thumbPath = filePath + "thumb/";
        String originalPath = filePath + "original/";

        if (!StringUtils.isEmpty(id)) {
            thumbPath += id + "/";
            originalPath += id + "/";
        }
        String dirPath = new SimpleDateFormat("yyyyMMdd").format(new Date()) + "/";

//        thumbPath +=  File.separator + dirPath+ File.separator ;
//        originalPath +=  File.separator + dirPath+ File.separator ;
        thumbPath += dirPath;
        originalPath += dirPath;
        File thumbDir = new File(thumbPath);
        if (!thumbDir.exists()) {
            thumbDir.mkdirs();
        }
        File originalDir = new File(originalPath);
        if (!originalDir.exists()) {
            originalDir.mkdirs();
        }
        String outName = UUID.randomUUID().toString().replaceAll("-", "") + "." + suffix;
//        String outName = String.join(".", new String[]{new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())+ (int) (Math.random() * 9000 + 1000),suffix});
        FileOutputStream fos = null;
        try {
            byte[] data = file.getBytes();
            fos = new FileOutputStream(originalPath + outName);
            fos.write(data);
            fos.close();
            CompressPic cp = new CompressPic();
            cp.compressPic(new File(originalPath + outName), thumbPath, outName);

            String thumbImages = thumbPath.substring(thumbPath.indexOf("/upload")) + outName;
            String originalImages = originalPath.substring(originalPath.indexOf("/upload")) + outName;

            Map<String, String> uploadMap = new HashMap<>();
            uploadMap.put("message", "上传成功");
            uploadMap.put("thumbImages", thumbImages);
            uploadMap.put("originalImages", originalImages);
            //uploadMap.put("finalIp", "http://192.168.1.67:8088");
            return CommonResult.success(uploadMap);
        } catch (IOException e) {
            e.printStackTrace();
            return CommonResult.failed(e.getMessage());
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @ApiOperation("多文件上传")
    @RequestMapping(value = "/multiUpload", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult multiUpload(HttpServletRequest request, String id) {
        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
        if (files.isEmpty()) {
            return CommonResult.validateFailed("上传失败，请选择文件");
        }
        String thumbImages = "";
        String originalImages = "";
        boolean isFirst = true;
        for (int i = 0; i < files.size(); i++) {
            MultipartFile file = files.get(i);
            if (file.isEmpty()) {
                continue;
            }
            //后缀处理
            String fileName = file.getOriginalFilename();
            String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);
            //路径 缩略图处理
            //        String thumbPath = filePath + "thumb"+File.separator ;
//        String originalPath = filePath + "original"+File.separator ;
            String thumbPath = filePath + "thumb/";
            String originalPath = filePath + "original/";

            if (!StringUtils.isEmpty(id)) {
                thumbPath += id + "/";
                originalPath += id + "/";
            }
            String dirPath = new SimpleDateFormat("yyyyMMdd").format(new Date()) + "/";

//        thumbPath +=  File.separator + dirPath+ File.separator ;
//        originalPath +=  File.separator + dirPath+ File.separator ;
            thumbPath += dirPath;
            originalPath += dirPath;
            File thumbDir = new File(thumbPath);
            if (!thumbDir.exists()) {
                thumbDir.mkdirs();
            }
            File originalDir = new File(originalPath);
            if (!originalDir.exists()) {
                originalDir.mkdirs();
            }
            String outName = UUID.randomUUID().toString().replaceAll("-", "") + "." + suffix;
            //开始流上传
            FileOutputStream fos = null;
            try {
                byte[] data = file.getBytes();
                fos = new FileOutputStream(originalPath + outName);
                fos.write(data);
                fos.close();
                CompressPic cp = new CompressPic();
                cp.compressPic(new File(originalPath + outName), thumbPath, outName);

                if (isFirst) {
//                    thumbImages += thumbPath.substring(thumbPath.indexOf(File.separator+"upload")) + outName;
//                    originalImages += originalPath.substring(originalPath.indexOf(File.separator+"upload")) + outName;
                    thumbImages += thumbPath.substring(thumbPath.indexOf("/upload")) + outName;
                    originalImages += originalPath.substring(originalPath.indexOf("/upload")) + outName;
                    isFirst = false;
                } else {
                    thumbImages += "," + thumbPath.substring(thumbPath.indexOf("/upload")) + outName;
                    originalImages += "," + originalPath.substring(originalPath.indexOf("/upload")) + outName;
                }
            } catch (IOException e) {
                e.printStackTrace();
                LOGGER.error(i + "文件失败");
            } finally {
                if (fos != null) {
                    try {
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        Map<String, String> uploadMap = new HashMap<>();
        uploadMap.put("message", "上传成功");
        uploadMap.put("thumbImages", thumbImages);
        uploadMap.put("originalImages", originalImages);
        return CommonResult.success(uploadMap);
    }


    @ApiOperation("单个文件(文件)上传")
    @RequestMapping(value = "/singleFileUpload", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult singleFileUpload(@RequestParam("file") MultipartFile file, String id) {
        if (file.isEmpty()) {
            return CommonResult.validateFailed("上传失败，请选择文件");
        }
        String fileName = file.getOriginalFilename();
        String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);

        String originalPath = filePath + "files/";

        if (!StringUtils.isEmpty(id)) {
            originalPath += id + "/";
        }
        String dirPath = new SimpleDateFormat("yyyyMMdd").format(new Date()) + "/";

        originalPath += dirPath;
        File originalDir = new File(originalPath);
        if (!originalDir.exists()) {
            originalDir.mkdirs();
        }
        String outName = UUID.randomUUID().toString().replaceAll("-", "") + "." + suffix;
        FileOutputStream fos = null;
        try {
            byte[] data = file.getBytes();
            fos = new FileOutputStream(originalPath + outName);
            fos.write(data);
            fos.close();
            String originalFile = originalPath.substring(originalPath.indexOf("/upload")) + outName;

            Map<String, String> uploadMap = new HashMap<>();
            uploadMap.put("message", "上传成功");
            uploadMap.put("originalFile", originalFile);
            return CommonResult.success(uploadMap);
        } catch (IOException e) {
            e.printStackTrace();
            return CommonResult.failed(e.getMessage());
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
