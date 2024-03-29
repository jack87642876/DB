package com.cy.pj.sys.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.pj.common.exception.ServiceException;
import com.cy.pj.sys.mapper.SysMenuMapper;
import com.cy.pj.sys.service.SysMenuService;
@Service
public class SysMenuServiceImpl implements SysMenuService {
	@Autowired
	private SysMenuMapper sysMenuMapper;
	@Override
	public List<Map<String, Object>> findObjects() {
		List<Map<String, Object>> list = sysMenuMapper.findObjects();
		if(list==null||list.size()==0)
			throw new ServiceException("没有对应的菜单信息");
		return list;
	}

}
