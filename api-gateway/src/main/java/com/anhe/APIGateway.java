package com.anhe;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@EnableZuulProxy
@SpringCloudApplication
public class APIGateway {
    public static void main(String[] args) {
        SpringApplication.run(APIGateway.class, args);
    }
}
