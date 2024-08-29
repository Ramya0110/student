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
import org.springframework.web.bind.annotation.RestController;

import com.ramya.student.model.StudentModel;
import com.ramya.student.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
//	TODO study about ResponseEntity
	@GetMapping("/get/{id}")
	private ResponseEntity<StudentModel> getStudent(@PathVariable Long id) {
		ResponseEntity<StudentModel> response = ResponseEntity.status(HttpStatus.OK)
				.body(studentService.getStudent(id));
		return response;
	}
	
	@PostMapping("/create")
	private ResponseEntity<String> createStudent(@RequestBody StudentModel student) {
		studentService.saveStudent(student);
		ResponseEntity<String> response =ResponseEntity.status(HttpStatus.CREATED).body("OK");
		return response;
	}
	
	@PutMapping("/update")
	private void updateStudent(@RequestBody StudentModel student) {
		studentService.updateStudent(student);
		
	}
	
	@DeleteMapping("/delete/{id}")
	private void deleteStudent(@PathVariable Long id) {
		studentService.deleteStudent(id);
		
	}

}
