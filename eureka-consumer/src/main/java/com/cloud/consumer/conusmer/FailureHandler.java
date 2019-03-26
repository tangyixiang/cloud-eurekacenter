package com.cloud.consumer.conusmer;

import org.springframework.stereotype.Component;

//交给spring管理
@Component
public class FailureHandler implements HelloRemote {
    @Override
    public String getProvider() {
        return "request is failure,please retry";
    }
}
