
package com.kgh.user.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import com.kgh.user.entity.User;

@Mapper
public interface UserMapper{
	public User getUser();
}