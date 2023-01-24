package com.jfjara.badservice.infrastructure.springboot.controller;

import com.jfjara.badservice.application.ports.GetSomethingUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BadController {

    @Autowired
    private GetSomethingUseCase getSomethingUseCase;

    @GetMapping("/getsomething")
    public ResponseEntity<String> get() {
        var result = getSomethingUseCase.execute();
        return result.map(r -> ResponseEntity.ok(r))
                .orElse(new ResponseEntity("Result not found", HttpStatus.NOT_FOUND));
    }
}
