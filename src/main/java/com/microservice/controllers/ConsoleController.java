package com.microservice.controllers;

import com.microservice.models.Console;
import com.microservice.services.ConsoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/consoles")
public class ConsoleController {

    @Autowired
    private ConsoleService consoleService;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Console get(@PathVariable Long id) {
           return consoleService.get(id);
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Console> getAll() {
        return consoleService.getAll();
    }
}
