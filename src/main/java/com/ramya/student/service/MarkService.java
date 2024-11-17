package com.ramya.student.service;

import com.ramya.student.dto.MarksDTO;
import com.ramya.student.model.MarkEntity;

public interface MarkService {
	
	void saveMark( MarkEntity mark);
	
	MarksDTO getMark(Long id);
	
	void updateMark(MarkEntity mark);
	
	void deleteMark(Long id);

}
