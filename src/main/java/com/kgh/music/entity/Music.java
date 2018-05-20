
package com.kgh.music.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.ibatis.type.JdbcType;

import tk.mybatis.mapper.annotation.ColumnType;
/**
 * 音乐表
 * @author kgh
 *
 */
public class Music implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2323831142296248065L;
	/**
	 * 主键 uuid自动生成
	 */
	private String id;
	/**
	 * 音乐名字
	 */
	private String musicName;
	
	
	/**
	 * 音乐专辑
	 */
	private String musicAlbum;
	/**
	 * 音乐附件ID
	 */
	private String musicAttachmentId;
	/**
	 * 音乐下载次数
	 */
	private String musicDownloadTimes;
	/**
	 * 音乐播放次数
	 */
	private String musicTimes;
	
	/**
	 * 音乐附件id
	 */
	private String uploadId;
	/**
	 * 音乐附件名   附件名 与 id  一样  （音乐）
	 */
	private String fileName;
	
	/**
	 * 音乐path
	 */
	private String filePath;
	
	/**
	 * 创建人
	 */
	private String createBy;
	/**
	 * 创建时间
	 */
	private Date createTime;
	
	/**
	 * 状态
	 */
	private int status;
	/**
	 * 歌手
	 */
	private String singer;
	/**
	 * 分页开始页
	 * @return
	 */
	public int start; 
	/**
	 * 分页结束页
	 * @return
	 */
	public int end; 
	/***
	 * 
	 * @return
	 */
	public int pag; 
	
	public int getPag() {
		return pag;
	}
	public void setPag(int pag) {
		this.pag = pag;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMusicName() {
		return musicName;
	}
	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}
	public String getMusicAlbum() {
		return musicAlbum;
	}
	public void setMusicAlbum(String musicAlbum) {
		this.musicAlbum = musicAlbum;
	}
	public String getMusicAttachmentId() {
		return musicAttachmentId;
	}
	public void setMusicAttachmentId(String musicAttachmentId) {
		this.musicAttachmentId = musicAttachmentId;
	}
	public String getMusicDownloadTimes() {
		return musicDownloadTimes;
	}
	public void setMusicDownloadTimes(String musicDownloadTimes) {
		this.musicDownloadTimes = musicDownloadTimes;
	}
	public String getMusicTimes() {
		return musicTimes;
	}
	public void setMusicTimes(String musicTimes) {
		this.musicTimes = musicTimes;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getUploadId() {
		return uploadId;
	}
	public void setUploadId(String uploadId) {
		this.uploadId = uploadId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	
	
}