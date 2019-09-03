package com.cy.pj.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class PageController {
	/**
	 * 主页
	 */
	@RequestMapping("doIndexUI")
	public String doIndexUI() {
		return "starter";
	}
	@RequestMapping("doPageUI")
	public String doPageUI() {
		return "common/page";
	}
	
}
