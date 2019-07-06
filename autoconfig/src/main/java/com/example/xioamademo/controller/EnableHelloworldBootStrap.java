package com.example.xioamademo.controller;

import com.example.xioamademo.annotion.EnableHelloworld;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@EnableHelloworld
public class EnableHelloworldBootStrap {
    public  static void main(String [] args){
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableHelloworldBootStrap.class).web(WebApplicationType.NONE).run(args);
        String  hello=context.getBean("helloWorld",String.class);

        System.out.print(hello);

      context.close();

    }
}
