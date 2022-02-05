package com.artemstukalenko.helloworld;

import com.artemstukalenko.helloworld.model.HelloWorldModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloWorldIntegrationTest {

    private static final String CONTROLLER_ADDRESS = "/api/helloWorld";
    private static final String HELLO_WORLD = "Hello World!";

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void uriCallReturnsHelloWorldModel() {
        final HelloWorldModel model = testRestTemplate.getForObject(CONTROLLER_ADDRESS, HelloWorldModel.class);

        assertNotNull(model);
    }

    @Test
    public void returnedModelContainsValidString() {
        final HelloWorldModel model = testRestTemplate.getForObject(CONTROLLER_ADDRESS, HelloWorldModel.class);

        assertEquals(HELLO_WORLD, model.getHelloWorldString());
    }
}
