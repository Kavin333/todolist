package com.crudlist.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Registeredlist")
public class RegisteredUser {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long register_id;
	private String username;
	private String email;
	private String password;
	private String confirm_password;
	public Long getRegister_id() {
		return register_id;
	}
	public void setRegister_id(Long register_id) {
		this.register_id = register_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirm_password() {
		return confirm_password;
	}
	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}

}
