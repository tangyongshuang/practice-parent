package com.anhe.handle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ExceptionHaldle {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionHaldle.class);


    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String, Object> habdle(Throwable throwable) {
        Map<String, Object> errorMap = new HashMap<>();
        errorMap.put("errorCode", 400);
        errorMap.put("errorMsg", "捕获到controller错误");
        logger.error(throwable.getMessage());
        logger.error("errorMap : {}",errorMap);
        return errorMap;
    }
}
