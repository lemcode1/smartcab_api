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

@RestController("/smartcab")

public class SmartCabController {
	
	@Autowired
	private UserRepository userRepository;
	
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
		System.out.println("Registration Request Details : " +regReq.toString());
		SmartCabUsers smartCabUsers = new SmartCabUsers();
		smartCabUsers.setEmail(regReq.getEmail());
		smartCabUsers.setFirstname(regReq.getFirstName());
		smartCabUsers.setLastname(regReq.getLastName());
		smartCabUsers.setPhno(regReq.getPhno());
		smartCabUsers.setConfirmPassword(regReq.getConfirmPassword());
		
		userRepository.save(smartCabUsers);

		ResponseEntity responseEntity = new ResponseEntity(HttpStatus.CREATED);
		return null;
		
	}
}
