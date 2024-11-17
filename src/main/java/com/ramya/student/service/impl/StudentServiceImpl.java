package com.ramya.student.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ramya.student.dto.StudentDTO;
import com.ramya.student.mapper.StudentMapper;
import com.ramya.student.model.StudentEntity;
import com.ramya.student.repo.StudentRepo;
import com.ramya.student.service.StudentService;

@Component
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepo studentRepo;
	
	@Autowired
	StudentMapper studentMapper;
	
	@Override
	public void saveStudent(StudentEntity student) {
		studentRepo.save(student);
		
	}
		
	@Override
	public StudentDTO getStudent(Long id) {
		// TODO read about Optional and make changes in the below line accordingly
		 StudentEntity student = studentRepo.findById(id).get();
		 return studentMapper.toDTO(student);		 
	}
	
	@Override
	public void updateStudent(StudentEntity student ) {
		studentRepo.save(student);
	}
	
	@Override
	public void deleteStudent(Long id) {
		studentRepo.deleteById(id);
		
	}

}
