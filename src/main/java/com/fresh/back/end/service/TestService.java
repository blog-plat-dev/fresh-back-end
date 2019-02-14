package com.fresh.back.end.service;

import java.util.List;

import com.fresh.back.end.model.Tests;

/**
 * 测试用
 * 
 * @author reborn
 */
public interface TestService {

	/**
	 * 测试增加功能
	 */
	public void add();

	/**
	 * 测试更新功能
	 */
	public void update();

	/**
	 * 测试删除功能
	 */
	public void delete();

	/**
	 * 测试查询功能
	 * 
	 * @return List 集合
	 */
	public List<Tests> queryAll();

}
