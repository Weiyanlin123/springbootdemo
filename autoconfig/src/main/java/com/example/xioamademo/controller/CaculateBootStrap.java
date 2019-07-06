package com.example.xioamademo.controller;

import com.example.xioamademo.service.CaculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(scanBasePackages = "com.example.xioamademo.service")
//@ComponentScan("com.example.xioamademo.service")
public class CaculateBootStrap {
    public  static void main(String [] args){
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CaculateBootStrap.class).web(WebApplicationType.NONE).
                         profiles("java7").
                run(args);
       CaculateService caculateService =context.getBean(CaculateService.class);
        System.out.print(caculateService.sum(1,2,3,4,5,6,7,8,9,10));

      context.close();

    }
}
