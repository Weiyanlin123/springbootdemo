package com.wei.springbootapplication.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

@Order(Ordered.LOWEST_PRECEDENCE)
public class AfterHelloworldApplicationContextInitializer<C extends ConfigurableApplicationContext> implements ApplicationContextInitializer {


    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {

        System.out.println("Afterapplication id########################"+configurableApplicationContext.getId());
    }



}
