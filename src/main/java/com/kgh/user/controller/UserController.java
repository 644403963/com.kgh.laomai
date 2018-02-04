
package com.kgh.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kgh.user.entity.User;
import com.kgh.user.service.UserService;

@RestController
@RequestMapping("user")
public class UserController{
	@Autowired
	UserService userService;
	@RequestMapping("getUser")
	public void getUser(){
		User user = userService.getUser();
		System.out.println(user.getTfUserName()+"1");
	}
}