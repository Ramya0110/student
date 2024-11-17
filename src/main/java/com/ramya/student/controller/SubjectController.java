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

import com.ramya.student.dto.SubjectDTO;
import com.ramya.student.model.SubjectEntity;
import com.ramya.student.service.SubjectService;

@RestController
@RequestMapping(value="/subject")
public class SubjectController {
	
	@Autowired
	private SubjectService subjectService;
	
	@GetMapping("/get/{id}")
	private ResponseEntity<SubjectDTO> getSubject(@PathVariable Long id) {
		ResponseEntity<SubjectDTO> response = ResponseEntity.status(HttpStatus.OK)
				.body(subjectService.getSubject(id));
		return response;
	}
	
	@PostMapping ("/create")
	private ResponseEntity<String> saveSubject(@RequestBody SubjectEntity subject) {
		subjectService.saveSubject(subject);
		ResponseEntity<String> response = ResponseEntity.status(HttpStatus.CREATED)
				.body("Created New Record");
		return response;
	}
	
	@PutMapping("/update")
	private ResponseEntity<String> updateSubject(@RequestBody SubjectEntity subject) {
		subjectService.updateSubject(subject);
		ResponseEntity<String> response = ResponseEntity.status(HttpStatus.OK)
				.body("Updated Record");
		return response;
	}
	
	@DeleteMapping("/delete/{id}")
	private ResponseEntity<String> deleteSubject(@PathVariable Long id) {
		subjectService.deleteSubject(id);
		ResponseEntity<String> response = ResponseEntity.status(HttpStatus.OK)
				.body("Deleted Record");
		return response;
	}
	
	

}
