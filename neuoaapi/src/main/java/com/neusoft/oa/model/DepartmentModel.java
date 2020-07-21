package com.neusoft.oa.model;

import java.io.Serializable;

import org.apache.ibatis.type.Alias;

@Alias("Department")
public class DepartmentModel implements Serializable {

	private int no=0;
	private String code=null;
	private String name=null;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
