package com.cy.pj.sys.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysMenuMapper {
	/**
	 * 菜单查询
	 * @return
	 */
	List<Map<String,Object>> findObjects();
	/**
	 * 基于id查询是否有子菜单
	 * @param id
	 * @return
	 */
	int getChildCount(Integer id);
	/**
	 * 根据id删除菜单
	 * @param id
	 * @return
	 */
	int deleteObject(Integer id);
}
