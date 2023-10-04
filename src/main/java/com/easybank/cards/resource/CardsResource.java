package com.easybank.cards.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsResource {

    @GetMapping("hello")
    public String sayHello() {
        return "Hello World";
    }
}
