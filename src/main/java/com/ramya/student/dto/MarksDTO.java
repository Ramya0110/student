package com.ramya.student.dto;

import com.ramya.student.model.StudentModel;
import com.ramya.student.model.SubjectModel;

import lombok.Data;

@Data
public class MarksDTO {
	private Long mrkId;
	private StudentModel mrkStdId;
	private SubjectModel mrkSubId;
	private Long mrkMark;
}
