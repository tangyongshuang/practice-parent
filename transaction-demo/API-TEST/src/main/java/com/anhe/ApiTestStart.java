package com.anhe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Created by Albert.Tang on 2019/5/10 2:56 PM.
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ApiTestStart {
    public static void main(String[] args) {
        SpringApplication.run(ApiTestStart.class, args);
    }
}
