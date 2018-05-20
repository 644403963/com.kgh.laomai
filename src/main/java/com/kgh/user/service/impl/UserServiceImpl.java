
package com.kgh.user.service.impl;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

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
	public boolean userLogIn(User user,ServletRequest req, ServletResponse res) {
		HttpServletRequest request = (HttpServletRequest)req;
		//查询用户密码 匹配的用户条数
		int userCount =userMapper.selectCount(user);
		if(userCount>0){
			//用户密码正确
			request.getSession().setAttribute("user",user);
			return true;
		}else{
			return false;
		}
	}
	@Override
	public User userReg(User user) {
		//加密
		try {
			userMapper.insert(user);
			return user;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
		
	}
	@Override
	public boolean youXi(User user) {
		// TODO Auto-generated method stub
		User e =userMapper.getUser();
		if(user.getUserName().equals(e.getUserName())){
			return true;
		}else {
			return false;
		}
		
	}
	@Override
	public boolean checkUserName(User user) {
		// TODO Auto-generated method stub
		//查询用户匹配的用户条数
				int userCount =userMapper.selectCount(user);
				if(userCount>0){
					//用户密码正确
					return true;
				}else{
					return false;
				}
	}
	
}