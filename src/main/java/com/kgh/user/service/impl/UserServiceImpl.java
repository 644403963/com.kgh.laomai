
package com.kgh.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgh.user.entity.User;
import com.kgh.user.mapper.UserMapper;
import com.kgh.user.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper userMapper;
	@Override
	public User getUser() {
		return userMapper.getUser();
		
	}
	@Override
	public boolean userLogIn(User user) {
		//查询用户密码 匹配的用户条数
		int userCount =userMapper.selectCount(user);
		if(userCount>0){
			//用户密码正确
			return true;
		}else{
			return false;
		}
	}
	@Override
	public User userReg(User user) {
		//要返回的数据
		User returnUser = new User();
		returnUser.setkUserName(user.getkUserName());
		returnUser.setkPassword(user.getkPassword());
		//加密
		try {
			userMapper.insert(user);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return returnUser;
	}
	
}