package com.example.appointment_management.security;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class SecurityConfiguration {
	
//	 private final JwtAuthenticationFilter jwtAuthFilter;
//	 private final AuthenticationProvider authenticationProvider;
	
	
	 private static final String[] WHITE_LIST_URL = {
	           // "/api/v1/**",
	           

	    };
	 
	 	@Bean
	    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	        http
	                .csrf(AbstractHttpConfigurer::disable)
	                .cors(cors -> cors.disable())
	                .authorizeHttpRequests(req ->
	                                    req.requestMatchers(WHITE_LIST_URL)
	                                    .permitAll()
	                                    .requestMatchers(HttpMethod.POST,"api/v1/offres").hasRole("RECRUTEUR")
	                                            .anyRequest()
	                                    .authenticated()
	                )
	                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//	                .authenticationProvider(authenticationProvider)
//	                .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class)
	                ;


	        return http.build();
	    }

}
