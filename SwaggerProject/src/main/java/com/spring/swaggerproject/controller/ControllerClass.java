package com.spring.swaggerproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@SecurityRequirement(name="secure")
public class ControllerClass {

	@GetMapping("/welcome")
	//@ApiOperation("Welcome Message API")
	public String hi() {
		return "Hi Welcome Sir!";
	}
}
