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

import com.ramya.student.dto.MarksDTO;
import com.ramya.student.model.MarkEntity;
import com.ramya.student.service.MarkService;

@RestController
@RequestMapping(value = "/mark")
public class MarkController {
	
	@Autowired
	MarkService markService;
	
	@PostMapping("/create")
	private ResponseEntity<String> saveMark(@RequestBody MarkEntity mark) {
		markService.saveMark(mark);	
		ResponseEntity<String> response = ResponseEntity.status(HttpStatus.CREATED)
				.body("Created New Mark Record");
		return response;
	}
	
	
	@GetMapping("/get/{id}")
	private ResponseEntity<MarksDTO> getMark(@PathVariable Long id) {		
		ResponseEntity<MarksDTO> response = ResponseEntity.status(HttpStatus.OK)
				.body(markService.getMark(id));
		return response;
	}
	
	@PutMapping("/update")
	private ResponseEntity<String> updateMark(@RequestBody MarkEntity mark) {
		markService.updateMark(mark);	
		ResponseEntity<String> response = ResponseEntity.status(HttpStatus.OK)
				.body("Updated Record");
		return response;
	}
	
	@DeleteMapping("/delete")
	private ResponseEntity<String> deleteMark(@PathVariable Long id) {
		markService.deleteMark(id);
		ResponseEntity<String> response = ResponseEntity.status(HttpStatus.OK)
				.body("Deleted Record");
		return response;
	}

}
