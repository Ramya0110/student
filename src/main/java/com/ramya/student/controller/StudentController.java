package com.ramya.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
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
@PreAuthorize("hasAuthority('TEACHER')")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@PreAuthorize("hasAuthority('TEACHER') or hasAuthority('ADMIN') or hasAuthority('STUDENT')")
	@GetMapping("/get/{id}")
	public ResponseEntity<StudentDTO> getStudent(@PathVariable Long id) {
		ResponseEntity<StudentDTO> response = ResponseEntity.status(HttpStatus.OK)
				.body(studentService.getStudent(id));
		return response;
	}
	
	@PostMapping("/create")
	public ResponseEntity<String> createStudent(@RequestBody StudentEntity student) {
		studentService.saveStudent(student);
		ResponseEntity<String> response =ResponseEntity.status(HttpStatus.CREATED)
				.body("Created New Record");
		return response;
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateStudent(@RequestBody StudentEntity student) {
		studentService.updateStudent(student);
		ResponseEntity<String> response = ResponseEntity.status(HttpStatus.OK)
				.body("Updated Record");
		return response;
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Long id) {
		studentService.deleteStudent(id);
		ResponseEntity<String> response = ResponseEntity.status(HttpStatus.OK)
				.body("Deleted Record");
		return response;
		
	}

}
