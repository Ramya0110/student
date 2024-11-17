package com.ramya.student.service;

import com.ramya.student.dto.StudentDTO;
import com.ramya.student.model.StudentEntity;


public interface StudentService {
	
	void saveStudent(StudentEntity student);
	
	StudentDTO getStudent(Long id);
	
	void updateStudent(StudentEntity student);
	
	void deleteStudent(Long id);

}
