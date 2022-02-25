package com.jamedgroup.SpringBootDemo;

import com.jamedgroup.SpringBootDemo.controller.SaySomething;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootDemoApplication.class, args);
		SaySomething saySomething = run.getBean(SaySomething.class);
		System.out.println(saySomething.say());
		System.out.println("Hi springBoot!");
	}


}
