package com.ramya.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramya.student.model.LoginRoleEntity;

public interface LoginRoleRepo extends JpaRepository<LoginRoleEntity, Long> {

}
