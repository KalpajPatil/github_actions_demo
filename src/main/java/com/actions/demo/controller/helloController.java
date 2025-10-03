package com.actions.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @GetMapping("/api")
    public ResponseEntity<String> sayHello(){
        return new ResponseEntity<>("Hello there!!", HttpStatus.OK);
    }
}
