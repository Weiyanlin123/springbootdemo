package com.example.xioamademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan("com.example.xioamademo.controller")
public class XioamademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(XioamademoApplication.class, args);
	}

}
