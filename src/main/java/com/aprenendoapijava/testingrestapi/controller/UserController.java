package com.aprenendoapijava.testingrestapi.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/api/user/{codigo}")
    public ResponseEntity consult(@PathVariable("codigo") String codigo)
    {
        return null;
    }
}
