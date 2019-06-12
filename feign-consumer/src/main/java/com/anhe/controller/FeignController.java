package com.anhe.controller;


import com.anhe.invoke.HelloService;
import com.anhe.invoke.RefactorBasicService;
import com.anhe.pojo.User;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.WebUtils;

@RestController
public class FeignController {

    private static final Logger logger = LoggerFactory.getLogger(FeignController.class);


    @Autowired
    private HelloService helloService;

    @Autowired
    private RefactorBasicService refactorBasicService;

//    @Autowired
//    private TestController testController;

    @RequestMapping("/feign-consumer")
    public String helloConsumer() {
        logger.info("feign-consumer is invoke...");
        return helloService.hello();
    }

    @RequestMapping("/feign-consumer2")
    public String helloConsumer2(HttpServletRequest request){
        logger.info("feign-consumer2 is invoke...");
        String sessionId = WebUtils.getSessionId(request);
        logger.info("[sessionId]: {}",sessionId);
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.hello1("albert")).append("\n");
        sb.append(helloService.hello2("albert",26)).append("\n");
        sb.append(helloService.hello3(new User("Albert",25)));
        return sb.toString();
    }

    @RequestMapping("/feign-consumer3")
    public String helloConsumer3(HttpServletRequest request){

        StringBuilder sb = new StringBuilder();
        sb.append(refactorBasicService.hello4("albert")).append("\n");
        sb.append(refactorBasicService.hello5("albert",26)).append("\n");
        sb.append(refactorBasicService.hello6(new com.anhe.dto.User("Albert",25)));
        return sb.toString();
    }
//
//    @RequestMapping("/feign-consumer4")
//    public String helloConsumer4(HttpServletRequest request){
//
//        StringBuilder sb = new StringBuilder();
//        sb.append(helloService.hello1("albert new ")).append("\n");
//        sb.append(helloService.hello2("albert new ",26)).append("\n");
//        sb.append(helloService.hello3(new User("Albert new ",25)));
//        return sb.toString();
//    }
}
