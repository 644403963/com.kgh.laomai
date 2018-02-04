
package com.kgh.user.service;

import com.kgh.base.service.BaseService;
import com.kgh.user.entity.User;

public interface UserService extends BaseService<User>{
	public User getUser();
}