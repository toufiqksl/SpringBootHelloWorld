package com.konasl.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@RequestMapping("/test")
	public String sampleIt(){
		return "Hello! Welcome to Spring Boot Sample. 123";
	}
}
