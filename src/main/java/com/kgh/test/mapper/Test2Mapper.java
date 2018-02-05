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
import com.kgh.test.entity.Test2;

@Mapper
public interface Test2Mapper extends BaseDao<Test2>{
	public Test getTest();
}