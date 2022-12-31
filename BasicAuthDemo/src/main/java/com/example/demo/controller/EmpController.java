package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
	
	
	    
	    @GetMapping("/hello")
	    public String   getHello() {
	    	
	    	 return   "Welcome To Spring Boot Security";
	    	
	    }

}
