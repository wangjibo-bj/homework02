package com.cec.practice.service;

import java.util.List;

import com.cec.practice.model.Coffee;
import com.github.pagehelper.PageInfo;

public interface ICoffeeService {

	void insert(Coffee coffee);

	void update(Coffee coffee);

	void delete(Long id);

	Coffee selectOneById(Long id);

	List<Coffee> selectList(int pageNum, int pageSize);

	PageInfo selectPage(int pageNum, int pageSize);

	PageInfo selectPage(Long[] ids, int pageNum, int pageSize);

	List<Coffee> testAppendSql(String sql);

	List<Coffee> selectByCondition(Coffee coffee);
}
