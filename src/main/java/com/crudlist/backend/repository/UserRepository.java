package com.crudlist.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudlist.backend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
