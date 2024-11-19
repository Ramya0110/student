package com.ramya.student.exception;

import java.util.Date;

import javax.persistence.EntityNotFoundException;

import org.hibernate.JDBCException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.AllArgsConstructor;
import lombok.Data;


@ControllerAdvice
public class CustomExceptionHandler {
	
	@Data
	@AllArgsConstructor
	class ExceptionResponse{
		private String type;
		private String reason;
		private Date timestamp;	
	}
	
	@ExceptionHandler
	public ResponseEntity<ExceptionResponse> handleException(Exception e){
		ExceptionResponse exceptionResponse = new ExceptionResponse(getExceptionType(e),e.getMessage(),new Date());
		return new ResponseEntity<>(exceptionResponse,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	private String getExceptionType(Exception e) {
		if (e instanceof HttpMessageNotReadableException) {
			return "HttpMessageNotReadableException";
		}
		else if (e instanceof JDBCException) {
			return "JDBCException";
		}
		else if (e instanceof DataIntegrityViolationException) {
			return "DataIntegrityViolationException";
		}
		else if (e instanceof EntityNotFoundException) {
			return "EntityNotFoundException";
		}
		return "Exception";
	}

}
