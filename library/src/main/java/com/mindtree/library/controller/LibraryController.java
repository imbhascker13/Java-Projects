package com.mindtree.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mindtree.library.dto.LibraryDto;
import com.mindtree.library.service.LibraryService;
import com.mindtree.library.service.UserService;
import com.mindtree.library.serviceexception.ServiceException;

@RestController
public class LibraryController {
	@Autowired
	LibraryService libraryService;
	@Autowired
	UserService userService;
	@PostMapping(value="/library")
	public LibraryDto addLibrary(@RequestBody LibraryDto library) {
		return libraryService.addLibrary(library);
	}
	@GetMapping(value="/alldetails")
	public ResponseEntity<List<LibraryDto>> getAllDetails() throws ServiceException{
		return ResponseEntity.status(HttpStatus.OK).body(libraryService.getAllDetails());
	}
	@GetMapping(value="/LibraryDetails")
	public ResponseEntity<List<LibraryDto>> getLibraryByUserCount(){
		return ResponseEntity.status(HttpStatus.OK).body(libraryService.getLibraryByUserCount());
	}

}
