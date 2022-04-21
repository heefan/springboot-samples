package com.example.demo;

import com.example.demo.domain.Address;
import com.example.demo.domain.Company;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Company.class)
public class Config {
    @Bean  //a bean of type Address.
    public Address getAddress() {
        return new Address("High Street", 1000);
    }

}
