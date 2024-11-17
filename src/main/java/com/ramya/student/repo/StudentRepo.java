package com.ramya.student.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ramya.student.model.StudentEntity;


public interface StudentRepo extends JpaRepository<StudentEntity, Long>{
	

}
