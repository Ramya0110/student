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

import com.ramya.student.model.SubjectModel;
import com.ramya.student.service.SubjectService;

@RestController
@RequestMapping(value="/subject")
public class SubjectController {
	
	@Autowired
	private SubjectService subjectService;
	
	@GetMapping("/get/{id}")
	private SubjectModel getSubject(@PathVariable Long id) {
		return subjectService.getSubject(id);
	}
	
	@PostMapping ("/create")
	private void saveSubject(@RequestBody SubjectModel subject) {
		subjectService.saveSubject(subject);
	}
	
	@PutMapping("/update")
	private void updateSubject(@RequestBody SubjectModel subject) {
		subjectService.updateSubject(subject);
	}
	
	@DeleteMapping("/delete/{id}")
	private void deleteSubject(@PathVariable Long id) {
		subjectService.deleteSubject(id);
	}
	
	

}
