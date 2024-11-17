package com.ramya.student.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramya.student.model.LoginRoleEntity;
import com.ramya.student.repo.LoginRoleRepo;
import com.ramya.student.service.LoginRoleService;

@Service
public class LoginUserRoleServiceImpl implements LoginRoleService{
	
	@Autowired
	LoginRoleRepo loginRoleRepo;
	
	@Override
	public LoginRoleEntity saveRole(LoginRoleEntity roleEntity) {
		return loginRoleRepo.save(roleEntity);
	}
}
