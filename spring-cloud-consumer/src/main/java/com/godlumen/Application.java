package com.godlumen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient//启动服务注册与发现
@EnableFeignClients//启用远程feign调用
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
