package com.example.demo;

import com.example.demo.domain.Company;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Company company = context.getBean("company", Company.class);

		System.out.println(company.getAddress().getStreet());
		System.out.println(company.getAddress().getNumber());
	}

}
