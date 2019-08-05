package com.example.xioamademo.test;

public class TestLamda {

    public static  void  main(String args[]){

        MathOperation addition = (int a, int b) -> a + b;
        System.out.println();
    }

interface MathOperation {
    int operation(int a, int b);
}

interface GreetingService {
    void sayMessage(String message);
}


    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }

}