
package com.kgh.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kgh.user.entity.User;
import com.kgh.user.service.UserService;
/**
 *  用户  操作controller 
 * @author create by kgh
 *
 */
@RestController
@RequestMapping("user")
public class UserController{
	@Autowired
	UserService userService;
	@RequestMapping("getUser")
	public void getUser(){
		
	}
	/**
	 * 
	 * @return
	 */
	
	@RequestMapping("userLogIn")
	public boolean userLogIn(User user){
		boolean isLog = userService.userLogIn(user);
		//true 登录成功   false 失败 返回原因。
		return isLog;
	}
	@RequestMapping("youxi")
	public boolean youXi(User user){
		boolean isLog = userService.youXi(user);
		//true 登录成功   false 失败 返回原因。
		return isLog;
	}
}