
package com.kgh.filter;

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
public class LogInController{
	@Autowired
	UserService userService;
	/**
	 * 用户登录
	 * @return
	 */
	
	@RequestMapping("userLogIn")
	public boolean userLogIn(User user,ServletRequest request, ServletResponse response){
		boolean isLog = userService.userLogIn(user,request,response);
		//true 登录成功   false 失败 返回原因。
		return isLog;
	}
}