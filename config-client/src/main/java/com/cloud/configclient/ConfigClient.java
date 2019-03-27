package com.cloud.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClient {
    @Value("${spring.config}")
    private String value;

    @GetMapping("/config")
    public String gitConfig(){
        return value;
    }

}
