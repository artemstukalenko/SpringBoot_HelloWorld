package com.artemstukalenko.helloworld.service.impl;

import com.artemstukalenko.helloworld.model.HelloWorldModel;
import com.artemstukalenko.helloworld.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public final class HelloWorldServiceImpl implements HelloWorldService {

    private final HelloWorldModel model;

    public HelloWorldServiceImpl(@Autowired HelloWorldModel model) {
        this.model = model;
    }

    @Override
    public HelloWorldModel getHelloWorldModel() {
        return model;
    }
}
