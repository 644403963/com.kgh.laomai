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
import com.kgh.test.entity.TestLongId;

@Mapper
public interface LongTestMapper extends BaseDao<TestLongId>{
	public Test getTest();
}