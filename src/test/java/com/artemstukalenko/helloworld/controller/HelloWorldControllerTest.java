package com.artemstukalenko.helloworld.controller;

import com.artemstukalenko.helloworld.model.HelloWorldModel;
import com.artemstukalenko.helloworld.service.HelloWorldService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class HelloWorldControllerTest {

    @InjectMocks
    private HelloWorldController controller;

    @Mock
    private HelloWorldService service;

    @Test
    public void controllerInvokesService() {
        controller.showHelloWorld();
        verify(service, times(1)).getHelloWorldModel();
    }

    @Test
    public void controllerReturnsHelloWorldModel() {
        final HelloWorldModel modelToReturn = new HelloWorldModel();

        when(service.getHelloWorldModel()).thenReturn(modelToReturn);

        final HelloWorldModel foundModel = controller.showHelloWorld();

        assertNotNull(foundModel);
        assertEquals(modelToReturn, foundModel);
    }

}
