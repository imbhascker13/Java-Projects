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

import com.mindtree.project.dto.AccountDto;
import com.mindtree.project.exception.ControllerException;
import com.mindtree.project.exception.ServiceException;
import com.mindtree.project.service.AccountService;

@RestController
public class AccountController {
	@Autowired
	AccountService accountService;
	@PostMapping(value = "/account")
	public ResponseEntity<Map<String, Object>> addAccount(@RequestBody AccountDto accountDto) throws ServiceException {
		AccountDto accountDto2= accountService.addAccount(accountDto);
		Map<String, Object> success = new HashMap<String, Object>();
		success.put("Status", HttpStatus.OK);
		success.put("TimeStamp", new Date());
		success.put("Body", accountDto2);
		return new ResponseEntity<Map<String, Object>>(success, HttpStatus.OK);

	}
	@GetMapping(value = "/accountig")
	public ResponseEntity<Map<String, Object>> addAccountToIg(@RequestParam int accountId,@RequestParam int igId) throws ControllerException {
		AccountDto accountDto= accountService.addAccountToIg(accountId,igId);
		Map<String, Object> success = new HashMap<String, Object>();
		success.put("Status", HttpStatus.OK);
		success.put("TimeStamp", new Date());
		success.put("Body", accountDto);
		return new ResponseEntity<Map<String, Object>>(success, HttpStatus.OK);

	}
}
