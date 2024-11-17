package com.ramya.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramya.student.model.LoginUserEntity;
import com.ramya.student.service.LoginUserService;

@RestController
@RequestMapping("/login")
@PreAuthorize("hasAuthority('ADMIN')")
public class LoginUserController {

	@Autowired
	private LoginUserService userService;

	@PostMapping(path = "/create")
	public ResponseEntity<Long> createUser(@RequestBody LoginUserEntity userEntity) {
		return new ResponseEntity<Long>(userService.createUser(userEntity), null, HttpStatus.CREATED);
	}
	
	
	@GetMapping(path = "/get/{id}")
	public ResponseEntity<LoginUserEntity> getUser(@PathVariable Long id) {
		return new ResponseEntity<LoginUserEntity>(userService.getUser(id), null, HttpStatus.OK);
	}
	
	@DeleteMapping(path = "/delete/{id}")
	public ResponseEntity<Boolean> deleteUser(@PathVariable Long id){
		return new ResponseEntity<Boolean>(userService.deleteUser(id),null,HttpStatus.OK);
	}
	

	

}
