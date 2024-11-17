package com.ramya.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramya.student.dto.DepartmentDTO;
import com.ramya.student.model.DepartmentEntity;
import com.ramya.student.service.DepartmentService;

@RestController
@RequestMapping(value="/department")
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@GetMapping("/get/{id}")
	private ResponseEntity<DepartmentDTO> getDepartment(@PathVariable Long id) {		
		ResponseEntity<DepartmentDTO> response = ResponseEntity.status(HttpStatus.OK)
				.body(departmentService.getDepartment(id));
		return response;
	}
	
	@PostMapping("/create")
	private ResponseEntity<String> createDepartment(@RequestBody DepartmentEntity department) {
		departmentService.saveDepartment(department);
		ResponseEntity<String> response = ResponseEntity.status(HttpStatus.CREATED)
				.body("Created New Record");
		return response;
	}
	
	@PutMapping("/update")
	private ResponseEntity<String> updateDepartment(@RequestBody DepartmentEntity department) {
		departmentService.saveDepartment(department);
		ResponseEntity<String> response = ResponseEntity.status(HttpStatus.OK)
				.body("Updated Record");
		return response;
	}
	
	@DeleteMapping("/delete/{id}")
	private ResponseEntity<String> deleteDepartment(@PathVariable Long id) {
		departmentService.deleteDepartment(id);
		ResponseEntity<String> response = ResponseEntity.status(HttpStatus.OK)
				.body("Deleted Record");
		return response;
	} 
}
