package com.example.appointment_management.dto.user;

import com.example.appointment_management.enums.Role;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class UserRequest {
	
	@NotBlank @Email
    private String email;
    
    @NotBlank @Size(min = 8)
    private String password;
    
    @NotNull
    private Role role;

}
