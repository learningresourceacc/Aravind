package com.spring.loggingsb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

	Logger logger = LoggerFactory.getLogger(LoggingController.class);

	@RequestMapping("/")
	public String home() {
		logger.trace("Hi");
		return "Simple Logging Test! Check out the console of your IDE for detailed logs.";
	}
}
