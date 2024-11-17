package com.ramya.student.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ramya.student.dto.DepartmentDTO;
import com.ramya.student.model.DepartmentEntity;

@Component
public class DepartmentMapper {
	
	public DepartmentDTO toDTO( DepartmentEntity department) {
		return DepartmentDTO.Builder.newInstance()
			.deptId(department.deptId)
			.deptCode(department.deptCode)
			.build();
		
	}
	



}
