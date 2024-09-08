package com.cc.designPatternDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableCaching
@ComponentScan(value = {"com.cc"})
public class DesignPatternDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternDemoApplication.class, args);
	}

}
