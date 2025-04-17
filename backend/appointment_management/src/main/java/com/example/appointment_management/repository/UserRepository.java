package com.example.appointment_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.appointment_management.model.User;

public interface UserRepository extends JpaRepository<User, Long>  {

}
