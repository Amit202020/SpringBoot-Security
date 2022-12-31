package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Employee;

@RestController
public class EmpController {
	
		List<Employee>  emplist = Arrays.asList(
				new Employee("1001","srini","seini@gmail.com"),
				new Employee("1002","max","max@gmail.com"),
				new Employee("1003","navin","navin@gmail.com"),
				new Employee("1004","nik","nik@gmail.com"),
				new Employee("1005","paro","paro@gmail.com")
				);
	
	    
	    @GetMapping("/hello")
	    public String   getHello() {
	    	
	    	 return   "Welcome To Spring Boot Security";
	    	
	    }
	    
	    @GetMapping("/allEmp")
	    public List<Employee>  getAllEmpDetails() {
	    	
	    	 return   emplist;
	    	
	    }


}
