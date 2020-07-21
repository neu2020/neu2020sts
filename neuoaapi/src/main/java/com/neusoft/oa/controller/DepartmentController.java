package com.neusoft.oa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.oa.model.DepartmentModel;
import com.neusoft.oa.service.IDepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	private IDepartmentService ds=null;
	@RequestMapping("/list/all")
	public List<DepartmentModel> getListByAll() throws Exception{
		return ds.getListByAll();
	}

}
