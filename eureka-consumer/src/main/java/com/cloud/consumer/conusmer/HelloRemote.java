package com.cloud.consumer.conusmer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//name = 服务提供者名称
@FeignClient(name="EUREKA-PROVIDER",fallback = FailureHandler.class)
public interface HelloRemote {
    @GetMapping("/provider/hello")
    String getProvider();

}
