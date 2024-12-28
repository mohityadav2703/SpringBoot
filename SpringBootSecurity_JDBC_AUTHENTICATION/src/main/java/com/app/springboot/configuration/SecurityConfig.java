package com.app.springboot.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.RequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	
	//Authentication
	
	@Bean
	public UserDetailsService configAuthentication(DataSource datasource) {
		
		UserDetails user1=User.withUsername("Mohit")
			.password("$2a$10$TG7zhBu0x4sdbj5v0.DbEeVsPjbBXMIyiwOEXWsI1pKuPWGHjzAAy")
			.authorities("ADMIN")
			.build();
		UserDetails user2=User.withUsername("Chandan")
			.password("$2a$10$xOqHy0IwMdmDAxYYHpxSeebC2rsCKXI2uLcQQyHdU4KNYELP0mn5W")
			.authorities("CUSTOMER")
			.build();
		
		JdbcUserDetailsManager users=new JdbcUserDetailsManager(datasource);
		users.createUser(user1);
		users.createUser(user2);
		return users;
	}
	
	//Authorization
	
	@Bean
	public SecurityFilterChain configAuthorization(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(
				request -> request.requestMatchers("/","/home").permitAll()
				.requestMatchers("/admin").hasAuthority("ADMIN")
				.requestMatchers("/customer").hasAuthority("CUSTOMER")
				.anyRequest().authenticated()
				)
		.formLogin( 
				form -> form.loginPage("/login").permitAll() 
				.defaultSuccessUrl("/hello", true)
				)
		.logout( logout -> logout.permitAll());
		
		return http.build();
	}
}
