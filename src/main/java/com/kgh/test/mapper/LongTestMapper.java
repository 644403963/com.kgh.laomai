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
import com.kgh.test.entity.TestLongId;

@Mapper
public interface LongTestMapper extends BaseMapper<TestLongId>{
	public Test getTest();
}