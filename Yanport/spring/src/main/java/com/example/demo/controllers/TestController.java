package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.example.demo.entities.InputEntity;
import com.example.demo.entities.OutputEntity;
import com.example.demo.enums.OrientationEnum;
import com.example.demo.services.ServiceTestImpl;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class TestController {
	@Autowired
	ServiceTestImpl st;
	@PostMapping("/test")
	 public OutputEntity saveAccount(@RequestBody InputEntity input){
	   
	   
		  return st.direction(input) ;
	   
	   
	   
	    }
	
	


}
