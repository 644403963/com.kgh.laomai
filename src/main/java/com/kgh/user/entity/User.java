
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
	@Column(name = "USER_NAME")
	@ColumnType(column="USER_NAME",jdbcType=JdbcType.VARCHAR)
	private String userName;
	/**
	 * 密码
	 */
	@Column(name = "PASSWORD")
	@ColumnType(column="PASSWORD",jdbcType=JdbcType.VARCHAR)
	private String passWord;
	
	/**
	 * 性别
	 */
	@Column(name = "SEX")
	@ColumnType(column="SEX",jdbcType=JdbcType.NUMERIC)
	private Long sex;
	/**
	 * 电话号码
	 */
	
	@Column(name = "PHONE_NUMBER")
	@ColumnType(column="PHONE_NUMBER",jdbcType=JdbcType.NUMERIC)
	private Long phoneNumber;
	/**
	 * 昵称
	 */
	@Column(name = "NICK_NAME")
	@ColumnType(column="NICK_NAME",jdbcType=JdbcType.VARCHAR)
	private String nickName;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Long getSex() {
		return sex;
	}
	public void setSex(Long sex) {
		this.sex = sex;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
}