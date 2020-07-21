package com.neusoft.oa.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.oa.model.DepartmentModel;

@Mapper
public interface IDepartmentMapper {

	//增加部门
	public void insert(DepartmentModel dm) throws Exception;
	//修改部门
	public void update(DepartmentModel dm) throws Exception;
	//删除部门
	public void delete(DepartmentModel dm) throws Exception;
	//取得所有部门列表
	public List<DepartmentModel> selectListByAll() throws Exception;
	//根据部门的no（PK）取得指定的部门对象
	public DepartmentModel selectByNo(int no) throws Exception;
}
