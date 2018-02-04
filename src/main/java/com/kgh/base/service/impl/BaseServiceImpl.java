package com.kgh.base.service.impl;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.stereotype.Service;

import com.kgh.base.service.BaseService;

@Service
public  class BaseServiceImpl<T> implements BaseService<T>{

	@Override
	public void save(T model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(List<T> models) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByIds(String ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(T model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T findBy(String property, Object value)
			throws TooManyResultsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findByIds(String ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findByCondition(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}/*
	
//	 @Resource
//	 protected MyMapper<T> baseMapper;
	@Override
	public void save(T record) {
		// TODO Auto-generated method stub
		baseMapper.insert(record);
	}

	@Override
	public void save(List<T> record) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		baseMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void deleteByIds(String ids) {
		// TODO Auto-generated method stub
		baseMapper.deleteByExample(ids);
	}

	@Override
	public void update(T record) {
		// TODO Auto-generated method stub
		baseMapper.updateByPrimaryKey(record);
	}

	@Override
	public T findById(Integer id) {
		// TODO Auto-generated method stub
		return baseMapper.selectByPrimaryKey(id);
	}

	@Override
	public T findBy(String property, Object value){
		return null;
	}

	@Override
	public List<T> findByIds(String ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findByCondition(T t) {
		// TODO Auto-generated method stub
		return baseMapper.select(t);
	}

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return baseMapper.selectAll();
	}
	
*/}