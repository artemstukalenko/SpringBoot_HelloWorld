package com.artemstukalenko.helloworld.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldModelTest {

    private static final String HELLO_WORLD = "Hello World!";

    @Test
    public void modelContainsHelloWorldString() {
        final HelloWorldModel model = new HelloWorldModel();
        assertEquals(HELLO_WORLD, model.getHelloWorldString());
    }

}
