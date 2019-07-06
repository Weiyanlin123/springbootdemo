package com.example.xioamademo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("java7")
@Service
public class Java7CaculateServiceImpl implements CaculateService{

    @Override
    public Integer sum(Integer ... values) {
System.out.print("java7profile");
        int  sum=0;
      for(int i=0;i<values.length;i++){
         sum+=values[i];
      }
        return sum;
    }

    public static void main (String [] args){
    Java7CaculateServiceImpl java7CaculateService=new Java7CaculateServiceImpl();
       System.out.print(java7CaculateService.sum(1,2,3,4,5,6,7,8,9,10));
    }
}
