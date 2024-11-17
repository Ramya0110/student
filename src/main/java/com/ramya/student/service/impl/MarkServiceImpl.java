package com.ramya.student.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ramya.student.dto.MarksDTO;
import com.ramya.student.mapper.MarksMapper;
import com.ramya.student.model.MarkEntity;
import com.ramya.student.repo.MarkRepo;
import com.ramya.student.service.MarkService;

@Component
public class MarkServiceImpl implements MarkService {
	
	@Autowired 
	MarkRepo markRepo;
	
	@Autowired
	MarksMapper marksMapper;
	
	@Override
	public void saveMark(MarkEntity mark) {
		// TODO Auto-generated method stub
		markRepo.save(mark);
	}
	
	@Override
	public MarksDTO getMark(Long id) {
		// TODO Auto-generated method stub
		Optional<MarkEntity> marks = markRepo.findById(id);
		return marks.isEmpty()?null:marksMapper.toDTO(marks.get());
		
	}
	
	@Override
	public void updateMark(MarkEntity mark) {
		// TODO Auto-generated method stub
		markRepo.save(mark);
	}
	
	@Override
	public void deleteMark(Long id) {
		// TODO Auto-generated method stub
		markRepo.deleteById(id);
	}

}
