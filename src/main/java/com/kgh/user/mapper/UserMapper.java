
package com.kgh.user.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.kgh.commonBaseDao.BaseMapper;
import com.kgh.user.entity.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {
	public User getUser();
}