package com.project.smartcab_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.smartcab_api.dto.LoginRequest;
import com.project.smartcab_api.dto.RegistrationRequest;
import com.project.smartcab_api.repository.SmartCabUsers;
import com.project.smartcab_api.repository.UserRepository;
import com.project.smartcab_api.service.SmartCabService;

@RestController("/smartcab")

public class SmartCabController {
	@Autowired
	private SmartCabService smartCabService;
	
	
	@PostMapping("/login")
	public ResponseEntity login(@RequestBody LoginRequest loginRequest   )
	{
		System.out.println("Login Details: " + loginRequest.toString());
		ResponseEntity responseEntity = new ResponseEntity(HttpStatus.CREATED);
		return responseEntity;
	}
	
	@PostMapping("/register")
	public ResponseEntity register(@RequestBody RegistrationRequest regReq) 
	{
		smartCabService.register(regReq);
		System.out.println("Registration Request Details : " +regReq.toString());
		return null;
		
		
		
	}
}
