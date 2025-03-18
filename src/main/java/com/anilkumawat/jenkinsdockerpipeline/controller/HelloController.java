package com.anilkumawat.jenkinsdockerpipeline.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("docker-java-app")
public class HelloController {
	
	@RequestMapping(path = "/test")
	public String test() {
		return "docker-java-app is up and running: " + new Date();
	}

}
