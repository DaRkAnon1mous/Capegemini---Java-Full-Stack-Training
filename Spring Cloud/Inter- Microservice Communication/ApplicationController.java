package com.sales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class ApplicationController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/accessApp")
    public String accessApp(){
    	String url="http://webapps.tekstac.com:8091/getInfo";
        return restTemplate.getForObject(url, String.class);
    }
}