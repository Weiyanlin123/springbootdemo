package com.wei.springbootapplication.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import java.util.Date;

@Order(Ordered.LOWEST_PRECEDENCE)
public class AfterHellowApplicationListener<E extends ApplicationEvent> implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("AfterHellowApplicationListener+++++++++++++++++++"+new Date().getTime());
    }
}
