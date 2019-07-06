package com.wei.springbootapplication.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import java.util.Date;

@Order(Ordered.HIGHEST_PRECEDENCE)
public class HellowApplicationListener <E extends ApplicationEvent> implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("HellowApplicationListener+++++++++++++++++++"+new Date().getTime());
    }
}
