package com.app.springboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

	//first step declare @Configuration & @EnableWebSecurity
@Configuration
@EnableWebSecurity
public class SecurityConfig {

	//2nd step declare 2 bean (Authentication & Authorization)
	
	// Authentication
	@Bean
	public UserDetailsService configAuthentication() throws Exception{
		UserDetails user1= User.withDefaultPasswordEncoder()
		     .username("Mohit")
		     .password("123")
		     .authorities("ADMIN")
		     .build();
		
		return new InMemoryUserDetailsManager(user1);
	}
	
	//Authorization
//	@Bean
//	public SecurityFilterChain configAuthorization(HttpSecurity http) throws Exception{
//		http.authorizeHttpRequests(request-> request.antMatchers("/","/hello").permitAll()
//													.anyRequest().authenticated())
//													.formLogin(form-> form.loginPage("/login").permitAll())
//													.logout(logout -> logout.permitAll());
//		return http.build();
//	}
	
	@Bean
	public SecurityFilterChain configAuthorization(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests(request-> request.requestMatchers("/","/hello").permitAll()
													.anyRequest().authenticated())
													.formLogin(form-> form.loginPage("/login").permitAll())
													.logout(logout -> logout.permitAll());
		return http.build();
	}
}
