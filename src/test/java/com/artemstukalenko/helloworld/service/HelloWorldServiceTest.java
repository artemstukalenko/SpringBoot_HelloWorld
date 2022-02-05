package com.artemstukalenko.helloworld.service;

import com.artemstukalenko.helloworld.model.HelloWorldModel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class HelloWorldServiceTest {

    @Mock
    private HelloWorldService service;

    @Test
    public void serviceReturnsModel() {

        final HelloWorldModel model = new HelloWorldModel();

        when(service.getHelloWorldModel()).thenReturn(model);

        final HelloWorldModel foundModel = service.getHelloWorldModel();

        verify(service, times(1)).getHelloWorldModel();
        assertNotNull(foundModel);
    }

}
