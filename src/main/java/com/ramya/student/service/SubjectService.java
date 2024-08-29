package com.ramya.student.service;

import com.ramya.student.model.SubjectModel;

public interface SubjectService {
	
	SubjectModel getSubject(Long id);
	
	void saveSubject(SubjectModel subject);
	
	void updateSubject(SubjectModel subject);
	
	void deleteSubject(Long id);
	

}
