package com.ibm.spring.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.spring.model.SampleRequest;
import com.ibm.spring.model.SampleResponse;

@RestController
public class Webcontroller {
	
	
	@PostMapping(value = "/test")
	public SampleResponse Test(@RequestBody SampleRequest input) {
		SampleResponse response = new SampleResponse();
		response.setFullName(input.getLastName()+" "+input.getFirstName());
		
		return response;
	}

}
