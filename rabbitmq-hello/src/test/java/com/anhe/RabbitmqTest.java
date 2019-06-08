package com.anhe;


import com.anhe.sender.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RabbitmqTest {

    @Autowired
    private Sender sender;

    @Test
    public void hello() throws Exception{
        for (int i = 0; i < 1000; i++) {
            sender.send();
        }
    }
}
