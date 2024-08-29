package com.ramya.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramya.student.model.DepartmentModel;

public interface DepartmentRepo extends JpaRepository<DepartmentModel, Long>{

}
