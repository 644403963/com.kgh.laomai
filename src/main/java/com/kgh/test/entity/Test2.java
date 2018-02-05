package com.kgh.test.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.ibatis.type.JdbcType;

import tk.mybatis.mapper.annotation.ColumnType;

@Table(name ="KGH_TEST")
public class Test2 implements Serializable{
	/**
	 * 自增  uuid 实体 测试
	 */
	private static final long serialVersionUID = 5865648250609512427L;
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	@ColumnType(column="ID",jdbcType=JdbcType.VARCHAR)
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "UUID")
	private String id;
	/**
	 * 鍒涘缓浜�	 */
	@Column(name = "TEST_NAME")
	@ColumnType(column="TEST_NAME",jdbcType=JdbcType.VARCHAR)
	private String testName;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	
}
