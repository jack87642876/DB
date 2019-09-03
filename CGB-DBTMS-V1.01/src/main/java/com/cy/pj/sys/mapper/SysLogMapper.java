package com.cy.pj.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.cy.pj.sys.pojo.SysLog;
@Mapper
public interface SysLogMapper {
	/**
	 * 基于条件查询当前页数据
	 * @param userName 查询条件(例如查询哪个用户的日志信息)
	 * @param startIndex 当前页的起始位置
	 * @param pageSize 当前页的页面大小
	 * @return
	 */
	List<SysLog> findPageObjects(@Param("username")String username,
								@Param("startIndex")Integer startIndex,
								@Param("pageSize")Integer pageSize);
	/**
	 * 基于条件查询总记录数
	 * @param userName 查询条件(例如查询哪个用户的日志信息)
	 * @return
	 */
	int getRowCount(@Param("username")String username);
	/**
	 * 根据id删除记录
	 * @param ids
	 * @return
	 */
	int deleteObjects(@Param("ids") Integer...ids);
}
