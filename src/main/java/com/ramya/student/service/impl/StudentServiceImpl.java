package com.ramya.student.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ramya.student.model.StudentModel;
import com.ramya.student.repo.StudentRepo;
import com.ramya.student.service.StudentService;

@Component
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepo studentRepo;
	
	@Override
	public void saveStudent(StudentModel student) {
		studentRepo.save(student);
		
	}
		
	@Override
	public StudentModel getStudent(Long id) {
		// TODO read about Optional and make changes in the below line accordingly
		return studentRepo.findById(id).get();
	}
	
	@Override
	public void updateStudent(StudentModel student ) {
		studentRepo.save(student);
	}
	
	@Override
	public void deleteStudent(Long id) {
		studentRepo.deleteById(id);
		
	}

}
