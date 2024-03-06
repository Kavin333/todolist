package com.crudlist.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudlist.backend.model.User;
import com.crudlist.backend.repository.UserRepository;

@Service
public class UserServiceModel implements UserService{

	
	@Autowired
	private UserRepository userRepository;
	
	@Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
	
	@Override
	public User createUser(User userlist) {
		return userRepository.save(userlist);
	}
	
	@Override
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
	
	@Override
	public User updateUser(Long id,User userlist) {
		if (userRepository.existsById(id)) {
            userlist.setId(id);
            return userRepository.save(userlist);
        }
        return null;
	}
}
