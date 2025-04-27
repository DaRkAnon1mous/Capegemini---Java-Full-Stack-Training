package com.sales.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sales.proxy.ServiceProxy;

@RestController
public class ApplicationController {

	@Autowired
	private ServiceProxy serviceProxy;
	
	@GetMapping(value="/accessApp")
//	public String retreiveInfo( ) {
		
	//	return null;
		
//	}
	
	public String accessApp() {
		return serviceProxy.getProductDetails();
	}
	
	
}