package com.crudlist.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudlist.backend.model.RegisteredUser;

public interface RegisterRepository extends JpaRepository<RegisteredUser, Long> {

}
