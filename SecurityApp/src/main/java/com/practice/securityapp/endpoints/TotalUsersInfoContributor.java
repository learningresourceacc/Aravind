package com.practice.securityapp.endpoints;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

//Custom Data to Info End-point
@Component
public class TotalUsersInfoContributor implements InfoContributor {
	
	@Override
	public void contribute(Info.Builder builder) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.put("Aravind-Level", 12);
		map.put("Siddanna-Level",12);
		map.put("Akshay-Level", 12);
		builder.withDetail("users", map);
	}

}
