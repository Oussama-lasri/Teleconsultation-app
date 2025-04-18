package com.example.appointment_management.dto.user;

import java.time.LocalDateTime;

import com.example.appointment_management.enums.Role;

import lombok.*;

@Data
@Builder
public class UserResponse {
    private Long id;
    private String email;
    private Role role;
    private boolean isVerified;
    private LocalDateTime createdAt;
}
