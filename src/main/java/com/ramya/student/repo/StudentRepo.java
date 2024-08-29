package com.ramya.student.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ramya.student.model.StudentModel;


public interface StudentRepo extends JpaRepository<StudentModel, Long>{
	

}
