package com.crudlist.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudlist.backend.model.RegisteredUser;
import com.crudlist.backend.repository.RegisterRepository;

@Service
public class RegisterServiceModel implements RegisterService{
	
	@Autowired
	private RegisterRepository registerRepository;
	
	@Override
	public RegisteredUser create_registrations(RegisteredUser registeredlist) {
		return registerRepository.save(registeredlist);
	}
	
	
	

}
