package com.ramya.student.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ramya.student.model.DepartmentModel;
import com.ramya.student.repo.DepartmentRepo;
import com.ramya.student.service.DepartmentService;

@Component
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	DepartmentRepo departmentRepo;
	
	@Override
	public DepartmentModel getDepartment(Long id) {
		// TODO Auto-generated method stub
		return departmentRepo.findById(id).get();
	}
	
	@Override
	public void saveDepartment(DepartmentModel department) {
		// TODO Auto-generated method stub
		departmentRepo.save(department);
	}
	
	@Override
	public void updateDepartment(DepartmentModel department) {
		// TODO Auto-generated method stub
		departmentRepo.save(department);
		
	}
	
	@Override
	public void deleteDepartment(Long id) {
		// TODO Auto-generated method stub
		departmentRepo.deleteById(id);
		
	}

}
