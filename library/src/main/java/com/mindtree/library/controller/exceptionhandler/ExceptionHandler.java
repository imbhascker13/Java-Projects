package com.mindtree.library.controller.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mindtree.library.controller.LibraryController;
import com.mindtree.library.controller.UserController;
import com.mindtree.library.dto.ExceptionDto;
import com.mindtree.library.serviceexception.ServiceException;

@RestControllerAdvice(assignableTypes= {LibraryController.class,UserController.class})
public class ExceptionHandler {
	@org.springframework.web.bind.annotation.ExceptionHandler(ServiceException.class)
	public ResponseEntity<ExceptionDto> serviceExceptionHandler(Exception e, Throwable cause){
	return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ExceptionDto(e.getMessage()));
	}
}
