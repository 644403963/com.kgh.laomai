
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
	
}