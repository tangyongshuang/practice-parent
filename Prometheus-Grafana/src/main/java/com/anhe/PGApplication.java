package com.anhe;


import io.prometheus.client.spring.boot.EnablePrometheusEndpoint;
import io.prometheus.client.spring.boot.EnableSpringBootMetricsCollector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableSpringBootMetricsCollector
@SpringBootApplication
@EnablePrometheusEndpoint
public class PGApplication {
    public static void main(String[] args) {
        SpringApplication.run(PGApplication.class,args);
    }
}
