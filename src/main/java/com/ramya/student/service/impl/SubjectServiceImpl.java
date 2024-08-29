package com.ramya.student.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ramya.student.model.SubjectModel;
import com.ramya.student.repo.SubjectRepo;
import com.ramya.student.service.SubjectService;

@Component
public class SubjectServiceImpl implements SubjectService {
	@Autowired
	SubjectRepo subjectRepo;
	
	@Override
	public SubjectModel getSubject(Long id) {
		// TODO Auto-generated method stub
		return subjectRepo.findById(id).get();
	}
	
	@Override
	public void saveSubject(SubjectModel subject) {
		// TODO Auto-generated method stub
		subjectRepo.save(subject);
		
	}
	
	@Override
	public void updateSubject(SubjectModel subject) {
		// TODO Auto-generated method stub
		subjectRepo.save(subject);
		
	}
	
	@Override
	public void deleteSubject(Long id) {
		// TODO Auto-generated method stub
		subjectRepo.deleteById(id);
	}

}
