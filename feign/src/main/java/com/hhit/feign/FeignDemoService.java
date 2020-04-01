package com.hhit.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "HH-SERVICE")
public interface FeignDemoService {
    @RequestMapping(value = "getInfo/show" , method = RequestMethod.GET)
    String getPortTwo();
}
