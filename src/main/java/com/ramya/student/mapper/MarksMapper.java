package com.ramya.student.mapper;

import org.springframework.stereotype.Component;

import com.ramya.student.dto.MarksDTO;
import com.ramya.student.model.MarkEntity;

@Component
public class MarksMapper {
	
	public MarksDTO toDTO(MarkEntity markEntity) {
		return MarksDTO.builder()
				.mrkId(markEntity.getMrkId())
				.mrkMark(markEntity.getMrkMark())
				.mrkStdId(markEntity.getMrkStdId())
				.mrkSubId(markEntity.getMrkSubId())
				.build();
		
	}

}
