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

import com.ramya.student.dto.StudentDTO;
import com.ramya.student.model.StudentEntity;
import com.ramya.student.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
//	TODO study about ResponseEntity
	@GetMapping("/get/{id}")
	private ResponseEntity<StudentDTO> getStudent(@PathVariable Long id) {
		ResponseEntity<StudentDTO> response = ResponseEntity.status(HttpStatus.OK)
				.body(studentService.getStudent(id));
		return response;
	}
	
	@PostMapping("/create")
	private ResponseEntity<String> createStudent(@RequestBody StudentEntity student) {
		studentService.saveStudent(student);
		ResponseEntity<String> response =ResponseEntity.status(HttpStatus.CREATED)
				.body("Created New Record");
		return response;
	}
	
	@PutMapping("/update")
	private ResponseEntity<String> updateStudent(@RequestBody StudentEntity student) {
		studentService.updateStudent(student);
		ResponseEntity<String> response = ResponseEntity.status(HttpStatus.OK)
				.body("Updated Record");
		return response;
		
	}
	
	@DeleteMapping("/delete/{id}")
	private ResponseEntity<String> deleteStudent(@PathVariable Long id) {
		studentService.deleteStudent(id);
		ResponseEntity<String> response = ResponseEntity.status(HttpStatus.OK)
				.body("Deleted Record");
		return response;
		
	}

}
