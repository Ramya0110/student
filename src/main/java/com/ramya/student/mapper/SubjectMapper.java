package com.ramya.student.mapper;

import org.springframework.stereotype.Component;

import com.ramya.student.dto.SubjectDTO;
import com.ramya.student.model.SubjectEntity;

@Component
public class SubjectMapper {
	
	public SubjectDTO toDTO(SubjectEntity subjectEntity) {
		return SubjectDTO.builder()
				.subDeptId(subjectEntity.getSubDeptId())
				.subId(subjectEntity.getSubId())
				.subName(subjectEntity.getSubName())
				.subSem(subjectEntity.getSubSem())
				.subYear(subjectEntity.getSubYear())
				.build();
	}

}
