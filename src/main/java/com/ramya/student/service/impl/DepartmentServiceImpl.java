package com.ramya.student.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ramya.student.dto.DepartmentDTO;
import com.ramya.student.mapper.DepartmentMapper;
import com.ramya.student.model.DepartmentEntity;
import com.ramya.student.repo.DepartmentRepo;
import com.ramya.student.service.DepartmentService;

@Component
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	DepartmentRepo departmentRepo;
	
	@Autowired
	DepartmentMapper departmentMapper;

	@Override
	public DepartmentDTO getDepartment(Long id) {
		// TODO Auto-generated method stub
//		return departmentMapper.toDto(departmentRepo.findById(id).get());
		DepartmentEntity department = departmentRepo.findById(id).get();
		return departmentMapper.toDTO(department);
		}
	
	@Override
	public void saveDepartment(DepartmentEntity department) {
		// TODO Auto-generated method stub
		departmentRepo.save(department);
	}
	
	@Override
	public void updateDepartment(DepartmentEntity department) {
		// TODO Auto-generated method stub
		departmentRepo.save(department);
		
	}
	
	@Override
	public void deleteDepartment(Long id) {
		// TODO Auto-generated method stub
		departmentRepo.deleteById(id);
		
	}

}
