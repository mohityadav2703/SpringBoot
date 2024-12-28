package com.app.springboot.util;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtil {
	
	@Value("${app.secret}")
	private String secret;
	
	public String getUsername(String token) {
		return getClaims(token).getSubject();
	}
	
	public Claims getClaims(String token) {
		return Jwts.parser()
				   .setSigningKey(secret.getBytes())
				   .parseClaimsJws(token).getBody();		
				
	}
	
	public String generateToken(String subject) {
		return Jwts.builder() // builders use to construct token
				.setSubject(subject)
				.setIssuer("Mohit")
				.setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis()+TimeUnit.MINUTES.toMillis(10)))
				.signWith(SignatureAlgorithm.HS256, secret.getBytes())
				.compact();
	}
}
