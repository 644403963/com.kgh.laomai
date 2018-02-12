
package com.kgh.user.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.ibatis.type.JdbcType;

import tk.mybatis.mapper.annotation.ColumnType;
/**
 * 用户信息表
 * @author kgh
 *
 */
@Table(name ="K_USER")
public class User implements Serializable{
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
	 * 用户名
	 */
	@Column(name = "K_USER_NAME")
	@ColumnType(column="K_USER_NAME",jdbcType=JdbcType.VARCHAR)
	private String kUserName;
	/**
	 * 密码
	 */
	@Column(name = "K_PASSWORD")
	@ColumnType(column="K_PASSWORD",jdbcType=JdbcType.VARCHAR)
	private String kPassword;
	
	/**
	 * 性别
	 */
	@Column(name = "K_SEX")
	@ColumnType(column="K_SEX",jdbcType=JdbcType.NUMERIC)
	private String kSex;
	/**
	 * 电话号码
	 */
	
	@Column(name = "K_PHONE_NUMBER")
	@ColumnType(column="K_PHONE_NUMBER",jdbcType=JdbcType.VARCHAR)
	private String kPhoneNumber;
	/**
	 * 昵称
	 */
	@Column(name = "K_NICK_NAME")
	@ColumnType(column="K_NICK_NAME",jdbcType=JdbcType.VARCHAR)
	private String kNickName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getkUserName() {
		return kUserName;
	}

	public void setkUserName(String kUserName) {
		this.kUserName = kUserName;
	}

	public String getkPassword() {
		return kPassword;
	}

	public void setkPassword(String kPassword) {
		this.kPassword = kPassword;
	}

	public String getkSex() {
		return kSex;
	}

	public void setkSex(String kSex) {
		this.kSex = kSex;
	}

	public String getkPhoneNumber() {
		return kPhoneNumber;
	}

	public void setkPhoneNumber(String kPhoneNumber) {
		this.kPhoneNumber = kPhoneNumber;
	}

	public String getkNickName() {
		return kNickName;
	}

	public void setkNickName(String kNickName) {
		this.kNickName = kNickName;
	}
	
	
	
}