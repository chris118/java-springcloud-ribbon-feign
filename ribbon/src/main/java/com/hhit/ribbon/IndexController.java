package com.hhit.ribbon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getInfo")
public class IndexController {

    @Autowired
    RibbonService ribbonService;

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

//
//    @Value("${server.port}")
//    String port;
//
//    @Value("${spring.application.name}")
//    String serviceName;
//
//    @RequestMapping("/show")
//    public String getInfo(){
//        return "I'm form service:"+serviceName+",port:"+port;
//    }

    @RequestMapping("/hello")
    public String showInfol(){
        logger.info("find port");
        return ribbonService.port();

    }
}
