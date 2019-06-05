package com.anhe.invoke;

import com.anhe.pojo.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "basic-application", fallback = HelloServiceFallback.class, configuration = FullLogConfiguration.class)
public interface HelloService {

    @RequestMapping("/hello")
    String hello();

    @RequestMapping("/hello1")
    String hello1(@RequestParam("name") String name);

    @RequestMapping("/hello2")
    User hello2(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping("/hello3")
    String hello3(@RequestBody User user);

}
