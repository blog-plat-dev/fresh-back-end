package com.fresh.back.end.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.springframework.stereotype.Component;
/**
 * 用于获取方法执行所花费的时间，生产环境关闭。
 * @author reborn
 *
 */
@Component
public class TimeFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("time filter init");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("time filter start");
		long startTime = System.currentTimeMillis();
		chain.doFilter(request, response);
		long endTime = System.currentTimeMillis();
		System.out.println("consume " + (endTime - startTime) + " ms...");
		System.out.println("time filter end");

	}

	@Override
	public void destroy() {
		System.out.println("time filter init");
	}

}
