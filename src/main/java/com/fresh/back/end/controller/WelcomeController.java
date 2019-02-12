package com.fresh.back.end.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fresh.back.end.service.TestService;
import com.fresh.back.end.utils.XYFJSONResult;

/**
 * 测试类
 * 
 * @author reborn
 */
@RestController
@RequestMapping("")
public class WelcomeController {

	@Autowired
	private TestService testService;

	@RequestMapping("/test.do")
	public String welcome() {
		return "hello ~ wolrd fresh";
	}

	/**
	 * 提交
	 * @return JSON
	 */
	@RequestMapping("/addSubmit.do")
	public XYFJSONResult addSubmit() {
		return XYFJSONResult.ok();
	}

	/**
	 * 更新
	 * @return JSON
	 */
	@RequestMapping("/updateSubmit.do")
	public XYFJSONResult updateSubmit() {
		return XYFJSONResult.ok();
	}

	/**
	 * 查询所有
	 * @return JSON
	 */
	@RequestMapping("/queryAll.do")
	public XYFJSONResult queryAll() {
		return XYFJSONResult.ok(testService.queryAll());
	}

}
