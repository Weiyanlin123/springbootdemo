package com.wei.springbootapplication;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashSet;
import java.util.LinkedHashSet;

@SpringBootApplication
class ImokSpringBootApplication {

    public static void main(String[] args) {
      // SpringApplication.run(ImokSpringBootApplication.class, args);

        HashSet source = new LinkedHashSet();
        source.add(ImokSpringBootApplication.class.getName());
        SpringApplication springApplication = new SpringApplication();
        springApplication.setSources(source);

        //主干
        springApplication.setWebApplicationType(WebApplicationType.NONE);
        ConfigurableApplicationContext context = springApplication.run(args);
        System.out.print(context.getBean(ImokSpringBootApplication.class));


    }

}
