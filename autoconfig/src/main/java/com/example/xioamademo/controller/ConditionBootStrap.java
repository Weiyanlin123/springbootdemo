package com.example.xioamademo.controller;

import com.example.xioamademo.condition.ConditionOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

public class ConditionBootStrap {


    @Bean
    @ConditionOnSystemProperty(name="user.name",value = "1")
    public  String helloWorld(){
        return  "helloWorld Bean";
    }

    public  static void main(String [] args){
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionBootStrap.class).web(WebApplicationType.NONE).
                run(args);
        String helloworld=context.getBean("helloWorld",String.class);
        System.out.print(helloworld);
      context.close();

    }
}
