package com.sales.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

//code here
@Component
public class ServiceProxy {

    @Autowired
    private RestTemplate restTemplate;

    public String getProductDetails() {
        String url = "http://webapps.tekstac.com:8099/getInfo";
        try {
            return restTemplate.getForObject(url, String.class);
        } catch (RestClientException e) {
            return "Sorry Service is unavailable";
        }
    }
}