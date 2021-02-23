package com.aprenendoapijava.testingrestapi.controller;


import com.aprenendoapijava.testingrestapi.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private IUserRepository repository;

    @GetMapping("/api/user/{codigo}")
    public ResponseEntity consult(@PathVariable("codigo") Integer codigo)
    {
        return repository.findById(codigo).map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
}
