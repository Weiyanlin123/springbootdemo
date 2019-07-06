package com.wei.springbootapplication.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloworldApplicationContextInitializer<C extends ConfigurableApplicationContext> implements ApplicationContextInitializer {


    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {

        System.out.println("ConfigurableApplicationContextid================================="+configurableApplicationContext.getId());
    }
}
