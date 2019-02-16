package com.fresh.back.end.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 拦截器，用于权限拦截，登陆拦截等 Demo类
 * 
 * @author reborn
 *
 */
public class TestInterceptor extends HandlerInterceptorAdapter {

/**
 * 请求执行之前
 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		long startTime = System.currentTimeMillis();
		request.setAttribute("startTime", startTime);
		return super.preHandle(request, response, handler);
	}

/**
 * 页面渲染前执行
 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		long startTime = (long) request.getAttribute("startTime");
		request.removeAttribute("startTime");
		long endTime = System.currentTimeMillis();
		System.out.println("请求响应时间" + new Long(endTime - startTime) + "ms");
		super.postHandle(request, response, handler, modelAndView);

	}
}
