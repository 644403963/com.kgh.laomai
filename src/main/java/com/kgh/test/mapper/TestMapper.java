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

@Mapper
public interface TestMapper extends BaseMapper<Test>{
	public Test getTest();
}