package com.mindtree.library.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.library.dto.UserDto;
import com.mindtree.library.service.UserService;
import com.mindtree.library.serviceexception.ServiceException;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	@PostMapping(value="/user")
	public UserDto addUser(@RequestBody UserDto user) {
		return userService.addUser(user);
	}
	@GetMapping(value="/getUser")
	public ResponseEntity<UserDto> getDetailsByUid(@RequestParam int userId) throws ServiceException {
		return ResponseEntity.status(HttpStatus.OK).body(userService.getDetailsByUid(userId));
	}
}
