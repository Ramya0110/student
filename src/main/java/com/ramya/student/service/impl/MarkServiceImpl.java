package com.ramya.student.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ramya.student.model.MarkModel;
import com.ramya.student.repo.MarkRepo;
import com.ramya.student.service.MarkService;

@Component
public class MarkServiceImpl implements MarkService {
	
	@Autowired 
	MarkRepo markRepo;
	
	@Override
	public void saveMark(MarkModel mark) {
		// TODO Auto-generated method stub
		markRepo.save(mark);
	}
	
	@Override
	public MarkModel getMark(Long id) {
		// TODO Auto-generated method stub
		return markRepo.findById(id).get();
	}
	
	@Override
	public void updateMark(MarkModel mark) {
		// TODO Auto-generated method stub
		markRepo.save(mark);
	}
	
	@Override
	public void deleteMark(Long id) {
		// TODO Auto-generated method stub
		markRepo.deleteById(id);
	}

}
