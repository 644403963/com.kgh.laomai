
package com.kgh.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kgh.test.entity.Test;
import com.kgh.test.entity.Test2;
import com.kgh.test.mapper.Test2Mapper;
import com.kgh.test.mapper.TestMapper;

@RestController
@RequestMapping("test")
public class TestController{
	@Autowired
	TestMapper dao;
	@Autowired
	Test2Mapper dao2;
	@RequestMapping("getTest")
	public void getTest(){
		Test t = dao.getTest();
		System.out.println(t.getId()+t.getTestName());
	}
	@RequestMapping("insertTest")
	public void inserTest(){
		Test t = new Test();
		t.setTestName("keguanghua");
		dao.insert(t);
		Test2 t2 = new Test2();
		dao2.insert(t2);
		System.out.println(t2.getTestName());
	}
	//必须加主键 根据主键进行。
	@RequestMapping("updateTest")
	public void updateTest(){
		Test t = new Test();
		t.setId("1");
		t.setTestName("keguanghua");
		dao.updateByPrimaryKeySelective(t);
	}
	
}