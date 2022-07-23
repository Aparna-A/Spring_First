package com.example.demo;

import org.springframework.stereotype.Component;

@Component //to decide to get the greeter object
public class Greeter {
    public String sayGreet(){
        return "Hello Spring";
    }
}
