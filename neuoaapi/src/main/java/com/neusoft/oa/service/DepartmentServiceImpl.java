package com.neusoft.oa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.oa.mapper.IDepartmentMapper;
import com.neusoft.oa.model.DepartmentModel;

@Service
@Transactional
public class DepartmentServiceImpl implements IDepartmentService {
	@Autowired
	private IDepartmentMapper dmm=null;
	@Override
	public void add(DepartmentModel dm) throws Exception {
		dmm.insert(dm);

	}

	@Override
	public void modify(DepartmentModel dm) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(DepartmentModel dm) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public List<DepartmentModel> getListByAll() throws Exception {
		
		return dmm.selectListByAll();
	}

	@Override
	public DepartmentModel getByNo(int no) throws Exception {
		
		return dmm.selectByNo(no);
	}

}
