package com.app.springboot.configuration;

import java.util.Collections;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@Configuration // it might be not work
@EnableSwagger2
public class SwaggerConfiguration {
	
	//step#2 Create Docket config method with @Bean
	@Bean
	public Docket configureDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
						.select()
						.apis(RequestHandlerSelectors.basePackage("com.app.springboot.controller"))
						.paths(PathSelectors.regex("/v1/api.*"))
						.build()
						// meta data to change the view of Docket(Entire Screen of swagger)
						.apiInfo(appInfo());			
	}

	private ApiInfo appInfo() {
		return new ApiInfo(
					"My App Test",  // Title
					"Hello User",   // Description
					"3.2GA",		// Versions
					"http://abcd.com", // terms of service url
					new Contact("Mohit","https://abcd.com","mohit.au001@gmail.com"), //contact details of developer(name,url,mailId..etc)
					"R-LICENSE",  //Licence(who has provide licence)
					"http://abc.com",  //Licence url
					Collections.emptyList()  //vendors collection
				);
	}

}
