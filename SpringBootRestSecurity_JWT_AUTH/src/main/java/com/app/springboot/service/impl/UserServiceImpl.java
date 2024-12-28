package com.app.springboot.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.app.springboot.entity.User;
import com.app.springboot.repository.UserRepository;
import com.app.springboot.service.UserService;

@Service
public class UserServiceImpl implements UserService,UserDetailsService {

	@Autowired
	private UserRepository repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	// password save to database in encoded form
	public Integer saveUser(User user) {
		String encPwd=encoder.encode(user.getPassword());
		user.setPassword(encPwd);
		return repo.save(user).getId();
	}

	
	public User findByUsername(String username) {
		Optional<User> opt=repo.findByUsername(username);
		if(opt.isPresent()) {
			return opt.get();
		}
		else
			return null;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=findByUsername(username);
		if(user==null) throw new UsernameNotFoundException(username+", NOT EXIST");
		
		List<GrantedAuthority> list=user.getRoles()
									.stream()
									.map(role ->new SimpleGrantedAuthority(role))
									.collect(Collectors.toList());
		return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(), list);
	}

}
