package com.cy.pj.sys.pojo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
@Data
public class SysLog implements Serializable{
	private static final long serialVersionUID = -792519437508193860L;
	private Integer id;
	private String username;
	private String operation;
	private String method;
	private String params;
	private Long time;
	private String ip;
	private Date createdTimeDate;
	
}
