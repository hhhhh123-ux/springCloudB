package com.gzq.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//Ribbon 和 Eureka 整合,客户端可以直接调用，不用关心IP地址和端口号
@SpringBootApplication
@EnableEurekaClient
public class springCloud {
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(springCloud.class, args);
        System.out.println("后台 启动成功");
    }
}
