package com.cloud.consumer.conusmer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloRemote remote;
    @Value("${consumer.name}")
    private String consumerName;

    @GetMapping("/hello")
    public String hello(){
        return consumerName+remote.getProvider();
    }


}
