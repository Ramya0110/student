package com.ramya.student.service;

import com.ramya.student.dto.SubjectDTO;
import com.ramya.student.model.SubjectEntity;

public interface SubjectService {
	
	SubjectDTO getSubject(Long id);
	
	void saveSubject(SubjectEntity subject);
	
	void updateSubject(SubjectEntity subject);
	
	void deleteSubject(Long id);
	

}
