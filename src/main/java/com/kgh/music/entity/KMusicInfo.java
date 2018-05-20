
package com.kgh.music.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.ibatis.type.JdbcType;

import tk.mybatis.mapper.annotation.ColumnType;
/**
 * 用户信息表
 * @author kgh
 *
 */
@Table(name ="K_MUSIC_INFO")
public class KMusicInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2323831142296248065L;
	/**
	 * 主键 uuid自动生成
	 */
	@Id
	@Column(name = "ID")
	@ColumnType(column="ID",jdbcType=JdbcType.VARCHAR)
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "UUID")
	private String id;
	/**
	 * 音乐名字
	 */
	@Column(name = "MUSIC_NAME")
	@ColumnType(column="MUSIC_NAME",jdbcType=JdbcType.VARCHAR)
	private String musicName;
	
	
	
	/**
	 * 音乐专辑
	 */
	@Column(name = "MUSIC_ALBUM")
	@ColumnType(column="MUSIC_ALBUM",jdbcType=JdbcType.VARCHAR)
	private String musicAlbum;
	/**
	 * 音乐附件ID
	 */
	@Column(name = "MUSIC_ATTACHMENT_ID")
	@ColumnType(column="MUSIC_ATTACHMENT_ID",jdbcType=JdbcType.VARCHAR)
	private String musicAttachmentId;
	/**
	 * 音乐下载次数
	 */
	@Column(name = "MUSIC_DOWNLOAD_TIMES")
	@ColumnType(column="MUSIC_DOWNLOAD_TIMES",jdbcType=JdbcType.NUMERIC)
	private int musicDownloadTimes;
	/**
	 * 音乐播放次数
	 */
	@Column(name = "MUSIC_TIMES")
	@ColumnType(column="MUSIC_TIMES",jdbcType=JdbcType.NUMERIC)
	private int musicTimes;
	/**
	 * 音乐状态
	 */
	@Column(name = "STATUS")
	@ColumnType(column="STATUS",jdbcType=JdbcType.NUMERIC)
	private int status;
	/**
	 * 审核不通过理由
	 */
	@Column(name = "REASON")
	@ColumnType(column="REASON",jdbcType=JdbcType.VARCHAR)
	private String reason;
	
	
	/**
	 * 创建人
	 */
	@Column(name = "CREATE_BY")
	@ColumnType(column="CREATE_BY",jdbcType=JdbcType.VARCHAR)
	private String createBy;
	/**
	 * 创建时间
	 */
	@Column(name = "CREATE_TIME")
	@ColumnType(column="CREATE_TIME",jdbcType=JdbcType.DATE)
	private Date createTime;
	
	/**
	 * 歌手
	 */
	@Column(name = "SINGER")
	@ColumnType(column="SINGER",jdbcType=JdbcType.VARCHAR)
	private String singer;
	
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

	public int getMusicDownloadTimes() {
		return musicDownloadTimes;
	}
	public void setMusicDownloadTimes(int musicDownloadTimes) {
		this.musicDownloadTimes = musicDownloadTimes;
	}
	public int getMusicTimes() {
		return musicTimes;
	}
	public void setMusicTimes(int musicTimes) {
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
	public void setCreateTime(java.util.Date date) {
		this.createTime = date;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	
}