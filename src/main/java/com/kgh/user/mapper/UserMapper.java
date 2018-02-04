
package com.kgh.user.mapper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import com.kgh.user.entity.User;

@MapperScan
@Repository
public interface UserMapper{
	public User getUser();
}