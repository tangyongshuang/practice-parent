package com.anhe;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class Trace2Application {

    private static final Logger logger = LoggerFactory.getLogger(Trace2Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Trace2Application.class, args);
    }

    @RequestMapping("trace-2")
    public String trace(HttpServletRequest request) {
        logger.info("===<call trace-2,TraceId: {},SpanId: {}>===",request.getHeader("X-B3-TraceId"),request.getHeader("X-B3-SpanId"));
        return "Trace";
    }
}
