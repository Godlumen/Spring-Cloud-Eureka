package com.godlumen.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "eureka-client")
public interface TestRemote {
    @RequestMapping("/test")
    public String test(@RequestParam("param") String param);
}
