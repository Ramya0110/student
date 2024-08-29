package com.ramya.student.service;

import com.ramya.student.model.StudentModel;


public interface StudentService {
	
	void saveStudent(StudentModel student);
	
	StudentModel getStudent(Long id);
	
	void updateStudent(StudentModel student);
	
	void deleteStudent(Long id);

}
