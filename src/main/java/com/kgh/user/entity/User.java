
package com.kgh.user.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Table(name ="TF_USER")
public class User implements Serializable{
	/**
	 * ss
	 */
	private static final long serialVersionUID = 2323831142296248065L;
	@Id
	@Column(name="TF_ID")
	private Long tfId;
	@Column(name="TF_USER_NAME")
	private String tfUserName;
	@Column(name="CF_PASSWORD")
	private String cfPassword;
	@Column(name="CF_TELEPHONE")
	private String cfTelephone;
	@Column(name="CF_ROLE")
	private String cfRole;
	@Transient
	private String name;
	
	
	public Long getTfId() {
		return tfId;
	}
	public void setTfId(Long tfId) {
		this.tfId = tfId;
	}
	public String getTfUserName() {
		return tfUserName;
	}
	public void setTfUserName(String tfUserName) {
		this.tfUserName = tfUserName;
	}
	public String getCfPassword() {
		return cfPassword;
	}
	public void setCfPassword(String cfPassword) {
		this.cfPassword = cfPassword;
	}
	public String getCfTelephone() {
		return cfTelephone;
	}
	public void setCfTelephone(String cfTelephone) {
		this.cfTelephone = cfTelephone;
	}
	public String getCfRole() {
		return cfRole;
	}
	public void setCfRole(String cfRole) {
		this.cfRole = cfRole;
	}
	
	
}