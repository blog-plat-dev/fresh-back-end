package com.fresh.back.end.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试类
 * @author reborn
 */
@RestController
@RequestMapping("")
public class WelcomeController {

	@RequestMapping("/test.do")
	public String welcome()
	{
		return "hello ~ wolrd fresh";
	}
	
}
