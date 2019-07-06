package com.example.xioamademo.annotion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfigration {

    @Bean
    public String helloWorld(){
        return  "helloworld2018";
    }
}
