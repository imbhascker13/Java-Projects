package com.mindtree.block.controller.handler;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mindtree.block.controller.BlockShopController;
import com.mindtree.block.exception.ServiceException;




@RestControllerAdvice(assignableTypes=BlockShopController.class)
public class ControllerExceptionHandler {
	
	@ExceptionHandler(ServiceException.class)
	public ResponseEntity<Map<String,Object>> serviceExceptionHandler(Exception e,Throwable cause){
		Map<String,Object> response=new LinkedHashMap<String, Object>();
		response.put("Headers", "ErrorMessage");
		response.put("Error", true);
		response.put("Body", e.getMessage());
		response.put("Header", HttpStatus.NOT_FOUND);
		return new ResponseEntity<Map<String,Object>> (response,HttpStatus.NOT_FOUND);
		
		
	}

}
