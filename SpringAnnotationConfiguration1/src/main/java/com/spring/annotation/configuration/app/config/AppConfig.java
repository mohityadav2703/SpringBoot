package com.spring.annotation.configuration.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.annotation.configuration.app.bean.PdfExport;

@Configuration
public class AppConfig {

	@Bean
	public PdfExport pobj() {
		PdfExport p = new PdfExport();
		p.setFileName("Spring-Boot And Micro-Services");
		p.setFileAuth("Raghu");
		return p;
	}
}
