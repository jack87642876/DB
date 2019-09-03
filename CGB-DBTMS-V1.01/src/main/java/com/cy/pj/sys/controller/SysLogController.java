package com.cy.pj.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cy.pj.sys.pojo.SysLog;
import com.cy.pj.sys.service.SysLogService;
import com.cy.pj.sys.vo.JsonResult;
import com.cy.pj.sys.vo.PageObject;

@Controller
@RequestMapping("/log/")
public class SysLogController {
	@Autowired
	private SysLogService sysLogService;
	/**
	 * 日志页面
	 */
	@RequestMapping("doLogListUI")
	public String doLogListUI() {
		return "sys/log_list";
	}
	/**
	 * 分页查询
	 * @param userName
	 * @param pageCurrent
	 * @return
	 */
	@RequestMapping("doFindPageObjects")
	@ResponseBody
	public JsonResult doFindPageObjects(String username,Integer pageCurrent) {
		PageObject<SysLog> pageObjects = sysLogService.findPageObjects(username, pageCurrent);
		return new JsonResult(pageObjects);
	}
	/**
	 *  根据id删除记录
	 */
	@RequestMapping("doDeleteObjects")
	@ResponseBody
	public JsonResult deleteObjects(Integer...ids) {
		sysLogService.deleteObjects(ids);
		return new JsonResult("删除ok");
	}
}
