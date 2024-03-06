package com.crudlist.backend.service;

import java.util.List;

import com.crudlist.backend.model.User;



public interface UserService {
        List<User> getAllUsers();
        
		User createUser(User user);

		void deleteUser(Long id);

		User updateUser(Long id, User userlist);
}


