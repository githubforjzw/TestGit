package com.smvd.test1;

import java.io.Serializable;

public class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer Pid;
	private String pname;
	private Integer page;
	
	@Override
	public String toString() {
		return "Person [Pid=" + Pid + ", pname=" + pname + ", page=" + page + "]";
	}

	public Integer getPid() {
		return Pid;
	}

	public void setPid(Integer pid) {
		Pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}
	
	
	
	
	
	
		

}
