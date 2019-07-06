package com.example.xioamademo.controller;


import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@EnableAutoConfiguration
public class EnableAutoBootStrap {
    public static void main(String [] args){
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableAutoBootStrap.class).web(WebApplicationType.NONE).
                run(args);
        String helloworld=context.getBean("helloWorld",String.class);
        System.out.print(helloworld);
        context.close();
    }
}
