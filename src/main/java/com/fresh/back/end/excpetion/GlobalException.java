package com.fresh.back.end.excpetion;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import com.fresh.back.end.utils.JsonResult;

/**
 * 全局异常处理 对没有被处理到的异常进行统一处理
 * 
 * @author reborn
 *
 */
@ControllerAdvice
public class GlobalException {
	@ExceptionHandler(value = Exception.class) // @ExceptionHandler 该注解声明异常处理方法
	public Object defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
		// 如果是ajax请求则返回json格式的信息
		if (isAjax(req)) {
			return JsonResult.errorException(e.getMessage());
		}
		ModelAndView mav = new ModelAndView();
		// 异常内容(页面展示)
		mav.addObject("exception", e);
		// 请求的url地址(页面展示)
		mav.addObject("url", req.getRequestURL());
		// 设置视图名称
		mav.setViewName("errorPage");
		// 如果发生异常则跳转到errorPage页面，该页面还未被配置
		return mav;
	}

	/**
	 * 判断请求是否属于ajax请求
	 * @param request
	 * @return
	 */
	public static boolean isAjax(HttpServletRequest request) {

		return (request.getHeaders("X-Requested-With") != null
				&& "XMLHttpReqeust".equals(request.getHeaders("X-Requested-With").toString()));
	}
}
