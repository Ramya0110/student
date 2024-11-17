package com.ramya.student.dto;

import com.ramya.student.model.StudentEntity;
import com.ramya.student.model.SubjectEntity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Builder
public class MarksDTO {
	private Long mrkId;
	private StudentEntity mrkStdId;
	private SubjectEntity mrkSubId;
	private Long mrkMark;
}
