package com.ramya.student.service;

import com.ramya.student.model.MarkModel;

public interface MarkService {
	
	void saveMark( MarkModel mark);
	
	MarkModel getMark(Long id);
	
	void updateMark(MarkModel mark);
	
	void deleteMark(Long id);

}
