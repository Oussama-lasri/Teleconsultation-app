package com.example.appointment_management.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.appointment_management.enums.Role;
import com.example.appointment_management.model.User;

public interface UserRepository extends JpaRepository<User, Long>  {
	 Optional<User> findByEmail(String email);
	 boolean existsByEmail(String email);
	    List<User> findByRole(Role role);
	    List<User> findByIsVerified(boolean isVerified);

}
