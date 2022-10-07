package com.project.smartcab_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.project.smartcab_api.dto.RegistrationRequest;
import com.project.smartcab_api.repository.SmartCabUsers;
import com.project.smartcab_api.repository.UserRepository;

@Component
public class SmartCabService {
	@Autowired
	private UserRepository userRepository;
	
	
	public ResponseEntity register(RegistrationRequest regReq) {
	SmartCabUsers smartCabUsers = new SmartCabUsers();
	smartCabUsers.setEmail(regReq.getEmail());
	smartCabUsers.setFirstname(regReq.getFirstName());
	smartCabUsers.setLastname(regReq.getLastName());
	smartCabUsers.setPhno(regReq.getPhno());
	smartCabUsers.setConfirmPassword(regReq.getConfirmPassword());
	
	userRepository.save(smartCabUsers);
	ResponseEntity responseEntity = new ResponseEntity(HttpStatus.CREATED);
	return responseEntity;
	}
}
