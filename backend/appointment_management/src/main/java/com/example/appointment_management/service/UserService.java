package com.example.appointment_management.service;

import org.springframework.stereotype.Service;

import com.example.appointment_management.dto.auth.AuthRequest;
import com.example.appointment_management.dto.auth.AuthResponse;
import com.example.appointment_management.dto.user.UserRequest;
import com.example.appointment_management.dto.user.UserResponse;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
	
	public UserResponse registerUser(UserRequest userRequest) {
		
		return null ;
	}
	
	public AuthResponse authenticate(AuthRequest authRequest) {
		
		return null ;
	}

}
