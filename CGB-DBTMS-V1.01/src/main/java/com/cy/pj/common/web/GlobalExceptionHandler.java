package com.cy.pj.common.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
/**全局异常处理类*/
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cy.pj.sys.vo.JsonResult;
@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public JsonResult doHandleRuntimeException(RuntimeException e) {
		e.printStackTrace();
		return new JsonResult(e);
	}
}
