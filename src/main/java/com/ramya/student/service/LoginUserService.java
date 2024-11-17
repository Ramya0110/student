package com.ramya.student.service;

import com.ramya.student.model.LoginUserEntity;

public interface LoginUserService {
	
	Long createUser(LoginUserEntity user);

	LoginUserEntity getUser(Long id);

	boolean deleteUser(Long id);
	
	LoginUserEntity findByname(String name);

}
