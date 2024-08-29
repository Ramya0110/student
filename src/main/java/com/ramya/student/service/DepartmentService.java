package com.ramya.student.service;

import com.ramya.student.model.DepartmentModel;

public interface DepartmentService {
	
	void saveDepartment(DepartmentModel department);
	
	void updateDepartment(DepartmentModel department);
	
	DepartmentModel getDepartment(Long id);
	
	void deleteDepartment(Long id);
	
}
