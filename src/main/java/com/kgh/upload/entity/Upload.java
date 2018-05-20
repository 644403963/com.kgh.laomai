
package com.kgh.upload.entity;

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
 * 附件表
 * @author kgh
 *
 */
@Table(name ="K_UPLOAD")
public class Upload implements Serializable{
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
	 * 文件名称
	 */
	@Column(name = "FILE_NAME")
	@ColumnType(column="FILE_NAME",jdbcType=JdbcType.VARCHAR)
	private String fileName;
	/**
	 * 文件路径
	 */
	@Column(name = "FILE_PATH")
	@ColumnType(column="FILE_PATH",jdbcType=JdbcType.VARCHAR)
	private String filePath;
	/**
	 * 文件路径
	 */
	@Column(name = "CREATEDATE")
	@ColumnType(column="CREATEDATE",jdbcType=JdbcType.VARCHAR)
	private String createdate;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}


	
}