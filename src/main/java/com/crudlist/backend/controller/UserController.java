package com.crudlist.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudlist.backend.model.User;
import com.crudlist.backend.service.UserService;

@RestController
@RequestMapping("/api/userlist")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/list")
	public ResponseEntity<List<User>> getAllUsers(){
		try {
			List<User> user = userService.getAllUsers();
			return new ResponseEntity<>(user,HttpStatus.OK);
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	@PostMapping("/createlist")
	public ResponseEntity<User> createUser(@RequestBody User user){
		User createdUser = userService.createUser(user);
		return new ResponseEntity<>(createdUser,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deleteuser/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        try {
        	userService.deleteUser(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        catch (Exception e) {
        	System.out.println(e);
        }
		return null;
    }
	@PostMapping("/updateuser")
	public ResponseEntity<User> updateUser(@RequestBody User user){
		User createdUser = userService.createUser(user);
		return new ResponseEntity<>(createdUser,HttpStatus.CREATED);
	}

}
