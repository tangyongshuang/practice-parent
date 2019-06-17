package com.anhe;


import io.prometheus.client.spring.boot.EnablePrometheusEndpoint;
import io.prometheus.client.spring.boot.EnableSpringBootMetricsCollector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
@EnableSpringBootMetricsCollector
@EnablePrometheusEndpoint
public class CircleMonitor2Application {
    public static void main(String[] args) {
        SpringApplication.run(CircleMonitor2Application.class, args);
    }
}
