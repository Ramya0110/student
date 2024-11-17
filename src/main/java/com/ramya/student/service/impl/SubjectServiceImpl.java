package com.ramya.student.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ramya.student.dto.SubjectDTO;
import com.ramya.student.mapper.SubjectMapper;
import com.ramya.student.model.SubjectEntity;
import com.ramya.student.repo.SubjectRepo;
import com.ramya.student.service.SubjectService;

@Component
public class SubjectServiceImpl implements SubjectService {
	@Autowired
	SubjectRepo subjectRepo;
	
	@Autowired
	SubjectMapper subjectMapper;
	
	@Override
	public SubjectDTO getSubject(Long id) {
		// TODO Auto-generated method stub
		Optional<SubjectEntity> subject = subjectRepo.findById(id);
		return subject.isEmpty()?null:subjectMapper.toDTO(subject.get());
	}
	
	@Override
	public void saveSubject(SubjectEntity subject) {
		// TODO Auto-generated method stub
		subjectRepo.save(subject);
		
	}
	
	@Override
	public void updateSubject(SubjectEntity subject) {
		// TODO Auto-generated method stub
		subjectRepo.save(subject);
		
	}
	
	@Override
	public void deleteSubject(Long id) {
		// TODO Auto-generated method stub
		subjectRepo.deleteById(id);
	}

}
