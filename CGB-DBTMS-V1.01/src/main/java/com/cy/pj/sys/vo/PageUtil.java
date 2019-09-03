package com.cy.pj.sys.vo;

import java.util.List;

import com.cy.pj.sys.pojo.SysLog;

public class PageUtil {
	public static <T>PageObject<T> setPageObject(String username, Integer pageCurrent,Integer pageSize,List<T> records,Integer rowCount){
		PageObject<T> pageObject = new PageObject<>();
		pageObject.setPageCount((rowCount-1)/pageSize+1);
		pageObject.setPageCurrent(pageCurrent);
		pageObject.setPageSize(pageSize);
		pageObject.setRecords(records);
		pageObject.setRowCount(rowCount);
		return pageObject;
	}
}
