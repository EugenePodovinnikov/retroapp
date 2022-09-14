package com.microservice.controllers;

import com.microservice.models.Console;
import com.microservice.models.Game;
import com.microservice.repositories.GameRepository;
import com.microservice.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/all")
    public List<Game> getAll() {
        return gameService.getAll();
    }

}
