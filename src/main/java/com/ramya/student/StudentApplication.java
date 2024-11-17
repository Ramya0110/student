package com.ramya.student;

import org.modelmapper.Conditions;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.convention.NameTokenizers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.ramya.student.dto.DepartmentDTO;
import com.ramya.student.dto.MarksDTO;
import com.ramya.student.model.MarkEntity;

@SpringBootApplication
@EnableJpaRepositories
public class StudentApplication {
	@Bean
	 public ModelMapper modelMapper() {
        ModelMapper mapper = new ModelMapper();
        mapper
                .getConfiguration()
//                .addValueReader(new RecordValueReader())
                .setSourceNameTokenizer(NameTokenizers.UNDERSCORE)
                .setSkipNullEnabled(true)
                .setPropertyCondition(Conditions.isNotNull());
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return mapper;
    }

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
//		MarkModel.A a = new MarkModel.A();
//		MarkModel mark = new MarkModel();
//		DepartmentDTO.Builder.newInstance()
//			.deptId(1L)
//			.deptCode(null)
//			.build();
//		MarksDTO.builder()
//			.mrkId(1L)
//			.mrkMark(80L)
//			.mrkStdId(null)
//			.mrkSubId(null)
//			.build();
		
		
	}

}
