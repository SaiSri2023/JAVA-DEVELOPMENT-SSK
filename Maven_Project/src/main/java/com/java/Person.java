package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

    @Autowired
    private Account account;

    @Autowired
    private Address address;
}