package com.example.xioamademo.annotion;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Import(HelloWorldConfigration.class)
@Import(HelloworldSelector.class)
public @interface EnableHelloworld {

}
