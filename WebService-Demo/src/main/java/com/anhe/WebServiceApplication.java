package com.anhe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Albert.Tang on 2019/4/28 9:57 AM.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class WebServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebServiceApplication.class,args);
    }
}
