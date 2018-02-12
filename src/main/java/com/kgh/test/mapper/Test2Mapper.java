/**
 * 
 */
/**
 * @author Administrator
 *
 */
package com.kgh.test.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.kgh.commonBaseDao.BaseMapper;
import com.kgh.test.entity.Test;
import com.kgh.test.entity.Test2;

@Mapper
public interface Test2Mapper extends BaseMapper<Test2>{
	public Test getTest();
}