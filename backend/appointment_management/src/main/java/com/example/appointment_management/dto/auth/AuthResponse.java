package com.example.appointment_management.dto.auth;

import com.example.appointment_management.dto.user.UserResponse;

import lombok.*;

@Data
@Builder
public class AuthResponse {
    private String accessToken;
    private UserResponse user;
}