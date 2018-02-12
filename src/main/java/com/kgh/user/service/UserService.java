
package com.kgh.user.service;

import com.kgh.user.entity.User;

public interface UserService{
	public User getUser();
	
	/**
	 * 登录  
	 * 
	 */
	public boolean userLogIn(User user);
	
	/**
	 * 用户注册
	 */
	public User userReg(User user);
}