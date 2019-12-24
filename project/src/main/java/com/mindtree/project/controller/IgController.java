package com.mindtree.project.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.project.dto.IgDto;
import com.mindtree.project.service.IgService;

@RestController
public class IgController {
	@Autowired
	IgService igService;
	@PostMapping(value = "/ig")
	public ResponseEntity<Map<String, Object>> addIg(@RequestBody IgDto igDto) {
		IgDto igDto2= igService.addIg(igDto);
		Map<String, Object> success = new HashMap<String, Object>();
		success.put("Status", HttpStatus.OK);
		success.put("TimeStamp", new Date());
		success.put("Body", igDto2);
		return new ResponseEntity<Map<String, Object>>(success, HttpStatus.OK);

	}
	@GetMapping(value = "/display")
	public ResponseEntity<Map<String, Object>> getAllAccountsByIgId(@RequestParam int igId) {
		IgDto igDto=igService.getAllAccountsByIgId(igId);
		Map<String, Object> success = new HashMap<String, Object>();
		success.put("Status", HttpStatus.OK);
		success.put("TimeStamp", new Date());
		success.put("Body", igDto);
		return new ResponseEntity<Map<String, Object>>(success, HttpStatus.OK);

	}
}
