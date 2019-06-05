package com.anhe.transactiondemo;

import com.anhe.service.HelloService;
import com.anhe.util.CountDownLatchUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Albert.Tang on 2019/4/10 8:37 PM.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloServiceTest {
    @Autowired
    private HelloService helloService;


    @Test
    public void testSayHello() throws Exception {

        long currentTimeMillis = System.currentTimeMillis();
        // 模拟1000个线程并发
        CountDownLatchUtil countDownLatchUtil = new CountDownLatchUtil(3500);
        countDownLatchUtil.latch(() -> {
            helloService.sayHello(currentTimeMillis);
        });
    }
}
