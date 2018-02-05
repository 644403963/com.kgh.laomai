package com.kgh.test.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.ibatis.type.JdbcType;

import tk.mybatis.mapper.annotation.ColumnType;
@Table(name = "T_EMERGENCY_PLAN")
public class EmergencyPlanVo  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2972166905570012284L;
	/**
	 * 涓婚敭id
	 */
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	@ColumnType(column="ID",jdbcType=JdbcType.LONGVARCHAR)
	private Long id;
	/**
	 * 鍒涘缓浜�	 */
	@Column(name = "CREATOR")
	@ColumnType(column="CREATOR",jdbcType=JdbcType.VARCHAR)
	private String creator;
	/**
	 * 涓婚敭id
	 */
	@Column(name = "CREATDEPT")
	@ColumnType(column="CREATDEPT",jdbcType=JdbcType.VARCHAR)
	private String createDept;
	/**
	 * 鍒涘缓鏃堕棿
	 */
	@Column(name = "CREATDATE")
	@ColumnType(column="CREATDEPT",jdbcType=JdbcType.DATE)
	private Date createDate;
	/**
	 * 鏇存柊鏃堕棿
	 */
	@Column(name = "UPDATEDATE")
	@ColumnType(column="UPDATEDATE",jdbcType=JdbcType.DATE)
	private Date updateDate;
	/**
	 * 棰勬鍚嶇О
	 */
	@Column(name = "PLAN_NAME")
	@ColumnType(column="PLAN_NAME",jdbcType=JdbcType.VARCHAR)
	private String planName;
	/**
	 * 棰勬绫诲瀷
	 */
	@Column(name = "PLAN_TYPE")
	@ColumnType(column="PLAN_TYPE",jdbcType=JdbcType.VARCHAR)
	private String planType;
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	
	public String getPlanType() {
		return planType;
	}
	public void setPlanType(String planType) {
		this.planType = planType;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getCreateDept() {
		return createDept;
	}
	public void setCreateDept(String createDept) {
		this.createDept = createDept;
	}
}
