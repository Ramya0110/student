package com.ramya.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramya.student.model.LoginRoleEntity;
import com.ramya.student.service.LoginRoleService;

@RestController
@RequestMapping("/login/role")
@PreAuthorize("hasAuthority('ADMIN')")
public class LoginRoleController {
		
	@Autowired
	private LoginRoleService roleService;
	
	@PostMapping(path = "/create")
	public ResponseEntity<LoginRoleEntity> createRole(@RequestBody LoginRoleEntity roleEntity) {
		return new ResponseEntity<LoginRoleEntity>(roleService.saveRole(roleEntity), null, HttpStatus.CREATED);
	}

}
