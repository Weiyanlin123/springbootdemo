package com.example.xioamademo.controller;

import com.example.xioamademo.reposity.MyRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.xioamademo.reposity")
public class RespositoryBootStrap {
    public  static void main(String [] args){
        ConfigurableApplicationContext context = new SpringApplicationBuilder(RespositoryBootStrap.class).web(WebApplicationType.NONE).run(args);
        MyRepository MyRepository=context.getBean("myRepository",MyRepository.class);
       System.out.print(MyRepository );
        String  hello=context.getBean("helloWorld",String.class);


        System.out.print(MyRepository );
        System.out.print(hello);

      context.close();

    }
}
