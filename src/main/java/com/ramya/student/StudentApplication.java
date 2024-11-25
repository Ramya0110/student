package com.ramya.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.ramya.student.model.LoginRoleEntity;
import com.ramya.student.model.LoginUserEntity;
import com.ramya.student.service.LoginRoleService;
import com.ramya.student.service.LoginUserService;

@SpringBootApplication
@EnableJpaRepositories
public class StudentApplication {
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String hibernateDDLAuto;
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
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
	
	@Bean
	CommandLineRunner run(LoginRoleService loginRoleService , LoginUserService loginUserService) {
		return str->{
			if(hibernateDDLAuto.equals("create")) {
				LoginRoleEntity adminRole = loginRoleService.saveRole(new LoginRoleEntity(null,"ADMIN"));
				loginRoleService.saveRole(new LoginRoleEntity(null,"STUDENT"));
				loginRoleService.saveRole(new LoginRoleEntity(null,"TEACHER"));
				loginUserService.createUser(new LoginUserEntity(null,"Ramya","abcd","ramya@gmail.com",List.of(adminRole)));
			}			
		};
	}
}
