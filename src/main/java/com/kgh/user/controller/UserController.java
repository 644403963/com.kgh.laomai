
package com.kgh.user.controller;

import groovy.util.logging.Log;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

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
	public boolean userLogIn(User user,ServletRequest request, ServletResponse response){
		boolean isLog = userService.userLogIn(user,request,response);
		//true 登录成功   false 失败 返回原因。
		return isLog;
	}
	/**
	 * 查重用户名
	 */
	@RequestMapping("checkUserName")
	public boolean checkUserName(User user){
		boolean isLog = userService.checkUserName(user);
		//true 登录成功   false 失败 返回原因。
		return isLog;
	}
	/**
	 * 注册用户
	 */
	@RequestMapping("insertUser")
	public Map<String,String> insertUser(User user){
		Map<String,String> result =new HashMap<String, String>();
		try {
			userService.userReg(user);
			result.put("result", "操作成功");
		} catch (Exception e) {
			// TODO: handle exception
			result.put("result", "操作是不");
		}
		return result;
	}
	@RequestMapping("youxi")
	public boolean youXi(User user){
		boolean isLog = userService.youXi(user);
		//true 登录成功   false 失败 返回原因。
		return isLog;
	}
}