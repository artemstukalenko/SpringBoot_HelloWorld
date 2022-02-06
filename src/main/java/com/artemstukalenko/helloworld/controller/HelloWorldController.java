package com.artemstukalenko.helloworld.controller;

import com.artemstukalenko.helloworld.model.HelloWorldModel;
import com.artemstukalenko.helloworld.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public final class HelloWorldController {

    private final HelloWorldService service;

    public HelloWorldController(@Autowired HelloWorldService service) {
        this.service = service;
    }

    @GetMapping("/helloWorld")
    public HelloWorldModel getHelloWorld() {
        return service.getHelloWorldModel();
    }

}
