package com.cloud.eurekaprovider.HelloProvider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class Provider {

    //测试 服务提供
    @GetMapping("/hello")
    public String providerHello(){
        return "this is hello service provider";
    }

}
