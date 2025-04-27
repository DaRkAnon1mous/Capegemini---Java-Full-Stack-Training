package com.sales.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "product-service", url = "http://webapps.tekstac.com:8091")
public interface ServiceProxy {

    @GetMapping("/getInfo")
    String getDetails();
	}