package com.example.demo.domain;

//public class Company {
//    private Address address;
//
//    public Company(Address address) {
//        this.address = address;
//    }
//}

import org.springframework.stereotype.Component;

@Component
public class Company {
    private Address address;

    public Company(Address address) {
        this.address = address;
    }
}