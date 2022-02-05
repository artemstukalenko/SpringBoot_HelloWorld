package com.artemstukalenko.helloworld.model;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldModel {

    private String helloWorldString;

    public HelloWorldModel() {
        this.helloWorldString = "Hello World!";
    }

    public String getHelloWorldString() {
        return this.helloWorldString;
    }

}
