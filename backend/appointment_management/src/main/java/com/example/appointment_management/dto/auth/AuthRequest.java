package com.example.appointment_management.dto.auth;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class AuthRequest {
    @NotBlank @Email
    private String email;
    
    @NotBlank @Size(min = 8)
    private String password;
}
