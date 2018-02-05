/**
 * 
 */
/**
 * @author Administrator
 *
 */
package com.kgh.test.mapper;

import org.apache.ibatis.annotations.Mapper;




import com.kgh.commonBaseDao.BaseDao;
import com.kgh.test.entity.Test;

@Mapper
public interface TestMapper extends BaseDao<Test>{
	public Test getTest();
}