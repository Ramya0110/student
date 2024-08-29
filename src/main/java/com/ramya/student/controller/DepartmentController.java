package com.ramya.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramya.student.model.DepartmentModel;
import com.ramya.student.service.DepartmentService;

@RestController
@RequestMapping(value="/department")
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@GetMapping("/get/{id}")
	private DepartmentModel getDepartment(@PathVariable Long id) {
		return departmentService.getDepartment(id);
	}
	
	@PostMapping("/create")
	private void createDepartment(@RequestBody DepartmentModel department) {
		departmentService.saveDepartment(department);
	}
	
	@PutMapping("/update")
	private void updateDepartment(@RequestBody DepartmentModel department) {
		departmentService.saveDepartment(department);
	}
	
	@DeleteMapping("/delete/{id}")
	private void deleteDepartment(@PathVariable Long id) {
		departmentService.deleteDepartment(id);
	}
}
