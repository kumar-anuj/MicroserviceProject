package com.anuj.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anuj.microservices.limitsservice.bean.LimitConfiguration;
import com.anuj.microservices.limitsservice.config.Configuration;

@RestController
public class LimitsConfigurationController {

	/*@Value("${limits-service.maximum}")
	private String maximum;
	@Value("${limits-service.minimum}")
	private String minimum;*/
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfiguration() {
		/*return new LimitConfiguration(Integer.valueOf(maximum), Integer.valueOf(minimum));*/
		
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}
}
