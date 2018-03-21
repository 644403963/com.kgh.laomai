package com.kgh.upload.controller;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.NestedRuntimeException;

import com.kgh.upload.entity.Const;
import com.kgh.upload.entity.IOUtils;


/**
 * Servlet方式下载【通过Response.getOutputStream推送到客户端】 <br>
 * 前端建议用iframe的方式去下载，可以避免360等浏览器的bug
 * 
 * @author zollty
 * @since 2013-10-24
 */
public class ServletFileDownload {
	private static final char EXTENSION_SEPARATOR = '.';
    public static final Map<String, String> MIME = new HashMap<String, String>();
    public static final String DEFAULT_CONTENT_TYPE = "application/octet-stream";
    static {
        // MIME类型
        MIME.put("csv", "text/comma-separated-values");
        MIME.put("xls", "application/x-msexcel");
        MIME.put("xlsx", "application/x-msexcel");
        MIME.put("txt", "text/plain");
        MIME.put("htm", "text/html");
        MIME.put("html", "text/html");
        MIME.put("htmls", "text/html");
        // MIME.put("zip", "application/x-compressed");
        MIME.put("zip", "application/x-zip-compressed");
        // MIME.put("zip", "application/zip");
        // MIME.put("zip", "multipart/x-zip");
        MIME.put("gz", "application/x-gzip");
        MIME.put("rar", "application/x-rar-compressed");

        MIME.put("doc", "application/msword");
        MIME.put("docx", "application/msword");
        MIME.put("wps", "application/application/vnd.ms-works");
        MIME.put("ppt", "application/application/vnd.ms-powerpoint");

        MIME.put("pdf", "application/pdf");
        MIME.put("jpe", "image/jpeg");
        MIME.put("jpeg", "image/jpeg");
        MIME.put("jpg", "image/jpeg");
        MIME.put("bmp", "image/bmp");
        MIME.put("png", "image/png");
        MIME.put("js", "application/x-javascript");
        // MIME.put("js", "application/x-ns-proxy-autoconfig");

        // MIME.put("rar", "application/rar");

        MIME.put("css", "text/css");
        MIME.put("avi", "video/msvideo");
        MIME.put("mp3", "audio/mp3");
        MIME.put("mp4", "video/mp4");

        MIME.put("jar", "application/x-java-archive");
        MIME.put("java", "text/x-java-source");
        MIME.put("class", "application/octet-stream");
        MIME.put("exe", "application/octet-stream");
    }

//    public static void fileDownload(String fileFullPath, HttpServletRequest request, HttpServletResponse response) {
//        String fileName = StringUtils.getFilenameFromPath(fileFullPath);
//        String contentType = StringUtils.getFilenameExtension(fileFullPath);
//        contentType = MIME.get(contentType);
//        fileDownload(fileName, fileFullPath, contentType, request, response);
//    }
//
//    public static void fileDownload(String fileFullPath, String contentType, HttpServletRequest request,
//            HttpServletResponse response) {
//        String fileName = StringUtils.getFilenameFromPath(fileFullPath);
//        fileDownload(fileName, fileFullPath, contentType, request, response);
//    }
    /**
     * 从路径（url或者目录都可以）中获取文件后缀（比如 txt）<br>
     * Extract the filename extension from the given path, e.g. "mypath/myfile.txt" -> "txt".
     *
     * @param path the file path (may be <code>null</code>)
     * @return the extracted filename extension, or <code>null</code> if none
     */
    public static String getFilenameExtension(String path) {
        if (null == path)
            return null;
        int extIndex = path.lastIndexOf(EXTENSION_SEPARATOR);
        if (extIndex == -1) {
            return null;
        }
        String path2 = path.replace(Const.WINDOWS_FOLDER_SEPARATOR, Const.FOLDER_SEPARATOR);
        int folderIndex = path2.lastIndexOf(Const.FOLDER_SEPARATOR);
        if (folderIndex > extIndex) {
            return null;
        }
        return path2.substring(extIndex + 1);
    }

    public static void fileDownload(String fileName, String fileFullPath, String contentType,
            HttpServletRequest request, HttpServletResponse response) {
        if (fileName.equals("")) {
            throw new IllegalArgumentException("The file name is null or empty! fileName=" + fileName);
        }
        if (fileFullPath.equals("")) {
            throw new IllegalArgumentException("The file path is null or empty! fileFullPath=" + fileFullPath);
        }
        if (contentType==null||contentType.equals("")) {
            contentType = getFilenameExtension(fileFullPath);
            contentType = MIME.get(contentType);
            if (contentType == null) {
                contentType = DEFAULT_CONTENT_TYPE;
            }
        }
        FileInputStream in = null;
        OutputStream out = null;
        File file = null;
        try {
            file = new File(fileFullPath);
            in = new FileInputStream(file);
            out = response.getOutputStream();
            // 设置输出的格式
            response.setContentType(contentType);
            response.addHeader("Content-Disposition", "attachment; " + praseAttachmentFilename(fileName, request));
            int len = (int) file.length();
            response.setContentLength(len);
            IOUtils.clone(in, len, out);
        } catch (Exception e) {
            //throw new NestedRuntimeException(e, "Error occured when download the file[" + fileFullPath + "]");
        } finally {
            IOUtils.closeIO(in, out);
        }
    }

//    public static void fileDownload(InputStream in, String fileName, String fileType, 
//            HttpServletRequest request, HttpServletResponse response) {
//        if (StringUtils.isNullOrEmpty(fileName)) {
//            throw new IllegalArgumentException("The file name is null or empty! fileName=" + fileName);
//        }
//        String contentType = null;
//        if (StringUtils.isNotEmpty(fileType)) {
//            contentType = MIME.get(fileType);
//        }
//        if (contentType == null) {
//            contentType = DEFAULT_CONTENT_TYPE;
//        }
//        OutputStream out = null;
//        try {
//            out = response.getOutputStream();
//            // 设置输出的格式
//            response.setContentType(contentType);
//            response.addHeader("Content-Disposition", "attachment; " + praseAttachmentFilename(fileName, request));
//            int len = IOUtils.clone(in, out);
//            response.setContentLength(len);
//        } catch (Exception e) {
//            throw new NestedRuntimeException(e);
//        } finally {
//            IOUtils.closeIO(in, out);
//        }
//    }
//
    private static String praseAttachmentFilename(String fileName, HttpServletRequest request)
            throws UnsupportedEncodingException {
        String rtn;
        if (isMSIEBrowser(request)) {
            rtn = "filename=" + URLEncoder.encode(fileName, Const.UTF_8);
        }
        else {
            rtn = "filename=" + new String(fileName.getBytes(Const.UTF_8), Const.ISO_8859_1);
        }
        // // Opera浏览器只能采用filename*
        // if (userAgent.indexOf("opera") != -1) {
        // rtn = "filename*=UTF-8''" + newFileName;
        // }
        return rtn;
    }

    private static boolean isMSIEBrowser(HttpServletRequest request) {
        String userAgentString = request.getHeader("User-Agent");
        boolean rtn = false;
        if (userAgentString != null && userAgentString.indexOf("MSIE") != -1) {
            rtn = true;
        }
        return rtn;
    }

}