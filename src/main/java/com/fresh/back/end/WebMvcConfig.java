package com.fresh.back.end;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.fresh.back.end.interceptor.TestInterceptor;

/**
 * 全局配置文件
 * 
 * @author reborn
 *
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

//	/**
//	 * 定义虚拟映射
//	 */
//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		// 重写方法
//		// 修改tomcat 虚拟映射
//		registry.addResourceHandler("/**").addResourceLocations().// 启用动态发布
//				addResourceLocations();// 
//	}

	/**
	 * 用于测试用户的请求时间
	 * @return
	 */
	@Bean
	public TestInterceptor doInterceptor() {
		return new TestInterceptor();
	}

	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(doInterceptor());// 记录请求的时间
//        registry.addInterceptor(loginInterceptor()).addPathPatterns("/**").excludePathPatterns("/adminUser/login","/other/*",
//       		"/adminUser/loginSubmit","/adminUser/logout.do");

	}

}
