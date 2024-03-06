package com.crudlist.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudlist.backend.model.RegisteredUser;
import com.crudlist.backend.service.RegisterService;

@RestController
@RequestMapping("/api")
public class RegistrationController {
	
	@Autowired
	private RegisterService registerService ;
	
	@PostMapping("/registrations")
	public ResponseEntity<RegisteredUser> create_registrations(@RequestBody RegisteredUser registeredUser){
		
		RegisteredUser createRegisteredUser = registerService.create_registrations(registeredUser);
		return new ResponseEntity<>(createRegisteredUser,HttpStatus.CREATED);
		
	}

}
