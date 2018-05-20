
package com.kgh.upload.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgh.upload.entity.UT;
import com.kgh.upload.entity.Upload;
import com.kgh.upload.mapper.UploadMapper;
import com.kgh.upload.service.impl.UploadService;

@Service
public class UploadServiceImpl implements UploadService{
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	UploadMapper uploadMapper;
	/**
	* 处理文件上传
	* 
	* @param name
	*            原始名称
	* @param type
	*            文件类型，可不传，默认解析
	* @param upload
	*            参数
	* @param in
	*            文件流
	* @throws IOException
	*/
	public void procFileUpload(String name, Upload upload, InputStream in) throws IOException {

	   if (name.endsWith(".sh") || name.endsWith(".py") || name.endsWith(".so")) {
	       throw new IllegalArgumentException("不允许上传该类型的文件！");
	   }
//	   
//	   if(UT.Str.isBlank(upload.getTuFileid()) || UT.Str.isBlank(upload.getTuType())) {
//	       throw new IllegalArgumentException("附件的业务编号和类型不能为空！");
//	   }
	   Date currentTime = new Date(System.currentTimeMillis());
	   // 生成文件名
	   String newName = currentTime.getTime()+"_" + name;
	   File saveFile = new File("G:/com.mycode/com.kgh.laomai/src/main/webapp/attachment/"+newName);

	   // 写入文件流
	   FileOutputStream out = new FileOutputStream(saveFile);
	   UT.IO.clone(in, out);
	   
	   logger.info("附件{}文件保存成功！", saveFile.getAbsolutePath());

	   // 文件基本信息入库
	   upload.setFileName(name);// 文件名
	   upload.setFilePath(saveFile.getAbsolutePath());// 文件路径
	   
	 //转换提日期输出格式
	 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	   try {
		   //创建时间
		upload.setCreatedate(dateFormat.format(new Date()));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   uploadMapper.insert(upload);
	   
	   logger.info("附件{}记录保存成功！", upload.toString());
//	   return "无值";
//	   return upload.getTuId();
	}
	/**
	 * 通过业务编号删除附件
	 * @param upload
	 * @see com.czy.sqm.common.service.UploadService#delUpload(com.czy.sqm.common.entity.Upload)
	 *//*
	@Override
	@Transactional
	public void delUpload(Upload upload) {//通过业务编号查询附件
	    QueryParams queryUploadParams = new QueryParams(Upload.class);
	    Criteria cirUpload = queryUploadParams.createCriteria();
	    cirUpload.andEqualTo("tuFileid", upload.getTuFileid());
	    List<Upload> uploadList = uploadMapper.selectListByParams(queryUploadParams);
	    if(!CollectionUtils.isEmpty(uploadList)) {
	    	for (Upload up : uploadList) {//所有附件删除
	            Upload record = new Upload();
	            record.setTuId(up.getTuId());
	            record.setTuStatus("1");//已删除
	            uploadMapper.updateSelectiveByPrimaryKey(record);
	            File file = new File(up.getTuFilepath());
	            if (file.exists() && file.isFile()) {
	                file.delete();
	            }
	        }
	    }
	}*/
}

