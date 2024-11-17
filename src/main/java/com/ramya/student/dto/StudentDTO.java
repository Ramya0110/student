package com.ramya.student.dto;

import java.sql.Date;

import com.ramya.student.enums.Gender;
import com.ramya.student.enums.Section;
import com.ramya.student.model.DepartmentEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
public class StudentDTO {
	
	private Long stdId;
	private DepartmentEntity stdDeptId;
	private Section stdSection;
	private String stdName;
	private Date stdDob;
	private Gender stdGender;
	
	

}
