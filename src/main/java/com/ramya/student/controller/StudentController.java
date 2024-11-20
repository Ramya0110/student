package com.ramya.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static com.ramya.student.constant.SwaggerConstants.Example.STUDENT_RESPONSE_EXAMPLE;
import static com.ramya.student.constant.SwaggerConstants.Example.GLOBAL_EXCEPTION_RESPONSE_EXAMPLE;
import com.ramya.student.dto.StudentDTO;
import com.ramya.student.exception.CustomExceptionHandler;
import com.ramya.student.model.StudentEntity;
import com.ramya.student.service.StudentService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@PreAuthorize("hasAuthority('TEACHER')")
@Tag(name = "Student Controller")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@PreAuthorize("hasAuthority('TEACHER') or hasAuthority('ADMIN') or hasAuthority('STUDENT')")
	@GetMapping("/get/{id}")
	@Operation(
			method = "GET",
			summary = "to get student object for a given id",
			security = {
					@SecurityRequirement(name = "Admin"),
					@SecurityRequirement(name = "Teacher"),
					@SecurityRequirement(name = "Student")
			},
			responses = {
					@ApiResponse(
							responseCode = "200",
							description = "Success Response",
							content = {
									@Content(
											mediaType = "application/json",
											schema = @Schema(
													title = "Student",
													type = "object",
													allOf = StudentEntity.class,
													description = "Success response is of type Student",
													example = STUDENT_RESPONSE_EXAMPLE
												)
										)
							}
					),
					@ApiResponse(
							responseCode = "500",
							description = "Internal Server Error",
							content = {
									@Content(
											mediaType = "application/json",
											schema = @Schema(
													title = "CustomExceptionHandler",
													type = "object",
													allOf = CustomExceptionHandler.ExceptionResponse.class,
													description = "Exception during request",
													example = GLOBAL_EXCEPTION_RESPONSE_EXAMPLE
												)
										)
							}
					),
					@ApiResponse(
							responseCode = "403",
							description = "Forbidden",
							content = {
									@Content(
											mediaType = "application/json",
											schema = @Schema(
													title = "",
													type = "",
													description = "Empty response"
												)
									)
							}
					)
			}
		)
	public ResponseEntity<StudentDTO> getStudent(@PathVariable Long id) {
		ResponseEntity<StudentDTO> response = ResponseEntity.status(HttpStatus.OK)
				.body(studentService.getStudent(id));
		return response;
	}
	
	@PostMapping("/create")
	public ResponseEntity<String> createStudent(@RequestBody StudentEntity student) {
		studentService.saveStudent(student);
		ResponseEntity<String> response =ResponseEntity.status(HttpStatus.CREATED)
				.body("Created New Record");
		return response;
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateStudent(@RequestBody StudentEntity student) {
		studentService.updateStudent(student);
		ResponseEntity<String> response = ResponseEntity.status(HttpStatus.OK)
				.body("Updated Record");
		return response;
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable Long id) {
		studentService.deleteStudent(id);
		ResponseEntity<String> response = ResponseEntity.status(HttpStatus.OK)
				.body("Deleted Record");
		return response;
		
	}

}
