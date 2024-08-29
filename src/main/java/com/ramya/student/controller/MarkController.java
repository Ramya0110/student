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

import com.ramya.student.model.MarkModel;
import com.ramya.student.service.MarkService;

@RestController
@RequestMapping(value = "/mark")
public class MarkController {
	
	@Autowired
	private MarkService markService;
	
	@PostMapping("/create")
	private void saveMark(@RequestBody MarkModel mark) {
		markService.saveMark(mark);		
	}
	
	
	@GetMapping("/get/{id}")
	private MarkModel getMark(@PathVariable Long id) {
		return markService.getMark(id);
	}
	
	@PutMapping("/update")
	private void updateMark(@RequestBody MarkModel mark) {
		markService.updateMark(mark);		
	}
	
	@DeleteMapping("/delete")
	private void deleteMark(@PathVariable Long id) {
		markService.deleteMark(id);
	}

}
