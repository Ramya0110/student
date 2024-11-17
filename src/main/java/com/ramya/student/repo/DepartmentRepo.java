package com.ramya.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramya.student.model.DepartmentEntity;

public interface DepartmentRepo extends JpaRepository<DepartmentEntity, Long>{

}
