package com.hhit.feign;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class FeignController {
    @Autowired
    FeignDemoService feignDemoService ;

    @GetMapping("getInfoTwo")
    public String getInfoTwo()
    {
        return feignDemoService.getPortTwo();
    }

}
