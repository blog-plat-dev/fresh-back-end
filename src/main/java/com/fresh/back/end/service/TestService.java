package com.fresh.back.end.service;

import java.util.List;

import com.fresh.back.end.model.Tests;

/**
 * 测试用
 * 
 * @author reborn
 */
public interface TestService {

	public void add();

	public void update();

	public void delete();

	public List<Tests> queryAll();

}
