package com.tsk.aop.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAop1Application {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(SpringAop1Application.class, args);

		for (String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
		//SpringApplication.run(SpringAop1Application.class, args);
	}
}
