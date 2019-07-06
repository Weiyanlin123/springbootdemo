package com.example.xioamademo.annotion;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@FirstReposity
public @interface SecondReposity {
    String value() default "";
}
