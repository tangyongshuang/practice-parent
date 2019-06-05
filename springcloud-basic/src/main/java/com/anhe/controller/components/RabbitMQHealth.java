package com.anhe.controller.components;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQHealth implements HealthIndicator {


    @Override
    public Health health() {
        int errorCpde = check();
        if (errorCpde!=0){
            return Health.down().withDetail("Error code",errorCpde).build();
        }
        return Health.up().build();
    }

    private int check() {
        return 2;
    }
}
