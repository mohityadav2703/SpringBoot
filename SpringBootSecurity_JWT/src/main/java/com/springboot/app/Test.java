package com.springboot.app;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class Test {

	public static void main(String[] args) {
		String secret="TestSampleSecret";
		
		String token=Jwts.builder()
		.setId("1234") // user uniqId
		.setSubject("MohitKumar") //username
		.setIssuer("Mohit-Test") //token Provider
		.setIssuedAt(new Date(System.currentTimeMillis())) //created time
		.setExpiration(new Date(System.currentTimeMillis()+TimeUnit.MINUTES.toMillis(5))) //exp time
		.signWith(SignatureAlgorithm.HS256, secret.getBytes())
		.compact();
		
		System.out.println(token);
		
		Claims c=Jwts.parser()
		.setSigningKey(secret.getBytes())
		.parseClaimsJws(token).getBody();
		
		System.out.println("username :"+c.getSubject());
		System.out.println("userId :"+c.getId());
		System.out.println("Issuer :"+c.getIssuer());
	}
}
