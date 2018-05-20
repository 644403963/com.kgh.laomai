
package com.kgh.user.service;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.kgh.user.entity.User;

public interface UserService{
	public User getUser();
	public boolean youXi(User user);
	/**
	 * 登录  
	 * 
	 */
	public boolean userLogIn(User user,ServletRequest request, ServletResponse response);
	/**
	 * 登录  
	 * 
	 */
	public boolean checkUserName(User user);
	
	/**
	 * 用户注册
	 */
	public User userReg(User user);
}