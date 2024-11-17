package com.ramya.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramya.student.model.LoginUserEntity;

public interface LoginUserRepo extends JpaRepository<LoginUserEntity, Long>{
	LoginUserEntity findByname(String name);
}
