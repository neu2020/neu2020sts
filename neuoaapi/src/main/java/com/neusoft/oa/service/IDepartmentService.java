package com.neusoft.oa.service;

import java.util.List;

import com.neusoft.oa.model.DepartmentModel;

public interface IDepartmentService {

	//增加部门
	public void add(DepartmentModel dm) throws Exception;
	//修改部门
	public void modify(DepartmentModel dm) throws Exception;
	//删除部门
	public void delete(DepartmentModel dm) throws Exception;
	//取得所有部门列表
	public List<DepartmentModel> getListByAll() throws Exception;
	//根据部门的no（PK）取得指定的部门对象
	public DepartmentModel getByNo(int no) throws Exception;
}
