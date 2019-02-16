package com.fresh.back.end.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fresh.back.end.service.TestService;
import com.fresh.back.end.utils.JsonResult;

/**
 * 测试类
 * 
 * @author reborn
 */
@RestController
@RequestMapping("")
public class WelcomeController {

    private final static Logger logger=LoggerFactory.getLogger(WelcomeController.class);	
	@Autowired
	private TestService testService;

	@RequestMapping("/test.do")
	public String welcome() {
//		throw new RuntimeException("error");
		logger.info("hello ~ wolrd start ...");
        logger.info("logback 成功了");
		return "hello ~ wolrd fresh";
	}

	/**
	 * 提交
	 * @return JSON
	 */
	@RequestMapping("/addSubmit.do")
	public JsonResult addSubmit() {
		return JsonResult.ok();
	}

	/**
	 * 更新
	 * @return JSON
	 */
	@RequestMapping("/updateSubmit.do")
	public JsonResult updateSubmit() {
		return JsonResult.ok();
	}

	/**
	 * 查询所有
	 * @return JSON
	 */
	@RequestMapping("/queryAll.do")
	public JsonResult queryAll() {
		return JsonResult.ok(testService.queryAll());
	}

}
