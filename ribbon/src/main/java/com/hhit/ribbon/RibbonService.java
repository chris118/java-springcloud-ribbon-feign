package com.hhit.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService implements IRibbonService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    LoadBalancerClient loadBalancerClient;

    public String port() {
        this.loadBalancerClient.choose("HH-SERVICE");
        String info = restTemplate.getForObject("http://HH-SERVICE/getInfo/port", String.class);
        return info;
    }

}
