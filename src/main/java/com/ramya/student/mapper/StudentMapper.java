package com.ramya.student.mapper;

import org.springframework.stereotype.Component;

import com.ramya.student.dto.StudentDTO;
import com.ramya.student.model.StudentEntity;

@Component
public class StudentMapper {
	
	public StudentDTO toDTO(StudentEntity studentEntity) {
		return StudentDTO.builder()
				.stdDeptId(studentEntity.getStdDeptId())
				.stdDob(studentEntity.getStdDob())
				.stdGender(studentEntity.getStdGender())
				.stdId(studentEntity.getStdId())
				.stdName(studentEntity.getStdName())
				.stdSection(studentEntity.getStdSection())
				.build();
	}
	
}
