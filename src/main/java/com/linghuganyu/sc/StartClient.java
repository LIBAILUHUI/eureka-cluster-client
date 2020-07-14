package com.linghuganyu.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Administrator
 * @description TODO
 * @date 2020/7/14
 */
@SpringBootApplication
@EnableEurekaClient
public class StartClient {

    public static void main(String[] args) {
        System.out.println("客户端1启动了");
        SpringApplication.run(StartClient.class);
    }
}
