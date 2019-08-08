package com.example.xioamademo.test;

public class TestFinal {

    public static void main(String[] args){
        TestFinal testFinal = new TestFinal();
        int i = 0;
        StringBuffer buffer = new StringBuffer("hello");
        testFinal.changeValue(buffer,i);
        System.out.println(buffer);
        System.out.println(i);
    }

    public void changeValue( StringBuffer buffer,int i){
        //final修饰引用类型的参数，不能再让其指向其他对象，但是对其所指向的内容是可以更改的。
        buffer = new StringBuffer("hi");
        i++;
        buffer.append("world");
        System.out.println(buffer);
    }
}