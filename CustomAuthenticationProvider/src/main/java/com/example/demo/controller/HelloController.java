package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.bean.Account;


@RestController
public class HelloController {
	
	 List<Account>   accs = Arrays.asList(
    		 new  Account("1234567898","Srini","saving"),
    		 new  Account("8765454343","max","current"),
    		 new  Account("4354343232","navin","current")
    		 );
	
	
	@GetMapping("/hello")
	public String getHello() {
		
		return "Welcome To Spring Boot Secutiry";
		
		
	}

	@GetMapping("/allAcc")
	public List<Account> getAllCust() {

		return accs;
	}
}
