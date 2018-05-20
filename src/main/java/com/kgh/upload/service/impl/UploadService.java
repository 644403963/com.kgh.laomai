/**
 * 
 */
/**
 * @author Administrator
 *
 */
package com.kgh.upload.service.impl;

import java.io.IOException;
import java.io.InputStream;

import com.kgh.upload.entity.Upload;

public interface UploadService{
	
	public void procFileUpload(String name, Upload upload, InputStream in) throws IOException;
	
}