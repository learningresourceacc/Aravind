package com.spring.swaggerproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Swagger Open-API Example", version = "2.0", description = "Simple welcome page test"))
@SecurityScheme(name="secure",scheme = "basic", type=SecuritySchemeType.HTTP, in = SecuritySchemeIn.HEADER)
public class SwaggerProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerProjectApplication.class, args);
	}

}
