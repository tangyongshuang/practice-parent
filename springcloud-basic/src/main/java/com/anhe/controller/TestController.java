package com.anhe.controller;


import com.anhe.pojo.User;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.WebUtils;

import java.util.List;

@RestController
@SuppressWarnings("all")
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private DiscoveryClient client;

    @Value("${server.port}")
    private Integer port;

    @Autowired
    private Registration registration;

    @RequestMapping("/hello")
    public String hello() {
        ServiceInstance instance = client.getLocalServiceInstance();
        List<String> serviceIds = client.getServices();
        for (String s : serviceIds) {
            List<ServiceInstance> instances = client.getInstances(s);
            for (ServiceInstance serviceInstance : instances) {
                System.out.println(serviceInstance.getUri());
                System.out.println(serviceInstance.getHost());
                System.out.println(serviceInstance.getPort());
                System.out.println(serviceInstance.getMetadata());
            }
        }
        String serviceId = registration.getServiceId();
        logger.info("registration#getServiceId {}", serviceId);
        logger.info("host: {} port: {}, service_id: {}", instance.getHost(), port, instance.getServiceId());

        return "hello";
    }

    @RequestMapping("/hello1")
    public String hello1(@RequestParam String name) {
        ServiceInstance instance = client.getLocalServiceInstance();
        List<String> services = client.getServices();
        String serviceId = registration.getServiceId();
        logger.info("registration#getServiceId {}", serviceId);
        logger.info("host: {} port: {}, service_id: {}", instance.getHost(), port, instance.getServiceId());

        return "hello" + name;
    }

    @RequestMapping("/hello2")
    public User hello2(@RequestHeader String name, @RequestHeader Integer age) {
        ServiceInstance instance = client.getLocalServiceInstance();
        List<String> services = client.getServices();
        String serviceId = registration.getServiceId();
        logger.info("registration#getServiceId {}", serviceId);
        logger.info("host: {} port: {}, service_id: {}", instance.getHost(), port, instance.getServiceId());

        return new User(name, age);
    }

    @RequestMapping("/hello3")
    public String hello3(HttpServletRequest request, @RequestBody User user) {
        String sessionId = WebUtils.getSessionId(request);
        logger.info("[sessionId]: {}",sessionId);
        return "hello" + user.getName() + "," + user.getAge();
    }
}
