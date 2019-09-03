package com.cy.pj.sys.service;

import com.cy.pj.sys.pojo.SysLog;
import com.cy.pj.sys.vo.PageObject;

public interface SysLogService {
	/**
	 * 通过此方法实现分页查询操作
	 * @param userName 基于条件查询时的参数名
	 * @param pageCurrent 当前的页码值
	 * @return
	 */
	PageObject<SysLog> findPageObjects(String username,Integer pageCurrent);
	/**
	 *  根据id删除记录
	 * @param ids
	 * @return
	 */
	int deleteObjects(Integer...ids);
}
