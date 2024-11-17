package com.ramya.student.service;

import com.ramya.student.dto.DepartmentDTO;
import com.ramya.student.model.DepartmentEntity;

public interface DepartmentService {
	
	void saveDepartment(DepartmentEntity department);
	
	void updateDepartment(DepartmentEntity department);
	
	DepartmentDTO getDepartment(Long id);
	
	void deleteDepartment(Long id);
	
}
