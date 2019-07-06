package com.example.xioamademo.EnableAutoConfiguation;

import com.example.xioamademo.annotion.EnableHelloworld;
import com.example.xioamademo.condition.ConditionOnSystemProperty;
import org.springframework.context.annotation.Configuration;

@Configuration//srpingz原始装配
@EnableHelloworld
@ConditionOnSystemProperty(name="user.name",value = "1")
public class EnableAutoConfigHelloworld {
}
