package com.example.xioamademo.condition;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class OnSystemPropertyCondition implements Condition{
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
     Map<String,Object> map= annotatedTypeMetadata.getAnnotationAttributes(ConditionOnSystemProperty.class.getName());
        String name=String.valueOf(map.get("name"));
        String value=String.valueOf(map.get("value"));
        //电脑用户属性，目前我的账户是1
          String javaPropertiesValue=  System.getProperty(name);
        return value.equals(javaPropertiesValue);
    }
}
