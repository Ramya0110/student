package com.ramya.student.dto;

import java.util.List;

import com.ramya.student.model.DepartmentEntity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SubjectDTO {
	
	private Long subId;
	private List<DepartmentEntity> subDeptId;
	private String subName;
	private Long subYear;
	private Long subSem;
	

}
