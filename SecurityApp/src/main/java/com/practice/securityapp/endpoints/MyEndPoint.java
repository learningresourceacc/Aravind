package com.practice.securityapp.endpoints;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Endpoint(id="myendpoint")
@Component
public class MyEndPoint {

	@ReadOperation
	@Bean
	public String Welcome() {
		return "Welcome to Custom Endpoint";
	}
}
