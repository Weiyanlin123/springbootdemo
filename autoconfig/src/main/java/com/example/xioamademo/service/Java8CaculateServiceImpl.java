package com.example.xioamademo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Profile("java8")
@Service
public class Java8CaculateServiceImpl implements CaculateService{

    @Override
    public Integer sum(Integer ... values) {
      System.out.print("java8profile");
        int sum=Stream.of(values).reduce(0,Integer ::sum);
        return sum;
    }
    public static void main (String [] args){
    Java8CaculateServiceImpl java8CaculateService=new Java8CaculateServiceImpl();
       System.out.print(java8CaculateService.sum(1,2,3,4,5,6,7,8,9,10));
    }
}
