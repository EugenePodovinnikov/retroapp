package com.microservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

@AllArgsConstructor
@Getter
public class Game {

    private String title;

    @Autowired
    private Console console;
}
