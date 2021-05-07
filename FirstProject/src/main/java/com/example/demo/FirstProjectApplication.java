package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(FirstProjectApplication.class, args);
		
		System.out.println("welcome to the first boot project....");
		Alien e=context.getBean(Alien.class);
		e.show();
		
//		Alien e1=context.getBean(Alien.class);
//		e1.show();
		
		
	}
}
