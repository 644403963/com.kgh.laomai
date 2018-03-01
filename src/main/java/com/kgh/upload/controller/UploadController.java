/**
 * 
 */
/**
 * @author Administrator
 *
 */
package com.kgh.upload.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.kgh.common.entity.Res;
import com.kgh.upload.entity.Upload;
import com.kgh.upload.service.impl.UploadService;
@RestController
@RequestMapping("upload")
public class UploadController{
	
	 public static final long MAXFILESIZE = 50 * 1024 * 1024;//最大限制 50M
	    public static final String INVALIDFILETYPE = ".exe,.msi,.bat,.ddl";
	    @Autowired
	    UploadService uploadService;
	    
	    
	    
/**
 * 附件上传demo，可通用，如果需要特殊处理，则自己写controller，调用service即可
 */
@RequestMapping("uploadFile")
public Res uploadFile(
       MultipartFile file
//        // 文件附件信息，组件自动添加
//        @RequestParam("name") String name, 
//        @RequestParam("type") String type,
//        @RequestParam("size") long size,
//        HttpServletRequest request,
//        // ---------- 业务参数
//        // 业务类型
//        @RequestParam String tuType
        ) throws IOException {
		String fileName = file.getOriginalFilename();
		Long size = file.getSize();
    //文件格式校验
    String fileLastfix = fileName.substring(fileName.lastIndexOf(".") + 1);
    if(INVALIDFILETYPE.indexOf(fileLastfix.toLowerCase()) > -1){
    	throw new IOException("不能上传可执行文件，请重新选择");
    }
    //文件大小校验
    if(size > MAXFILESIZE){
    	throw new IOException("文件大小不能超过50M");
    }
    Upload tupload = new Upload();
//    tupload.setTuType(tuType);
    tupload.setTuIndex("0");// tab顺序
    long recordId = uploadService.procFileUpload(fileName, tupload, file.getInputStream());
    
    return Res.ok(recordId);
}

/**
 * 根据业务ID，下载附件
 */
@GetMapping("download/{id}")
public void downloadById(@PathVariable("id") Long id, HttpServletRequest request, HttpServletResponse response) {
    String path="url";
    ServletFileDownload.fileDownload("附件名", path, null, request, response);
}
}