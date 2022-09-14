package com.microservice.controllers;

import com.microservice.models.Game;
import com.microservice.services.ConsoleService;
import com.microservice.services.GameService;
import com.microservice.services.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DebugController {

    @Autowired
    private ManagerService managerService;
    @Autowired
    private ConsoleService consoleService;
    @Autowired
    private GameService gameService;

    @GetMapping("/debug!")
    public void run() {
        List<Game> games = new ArrayList<>();
        games.add(new Game("Beyond Oasis"));
        managerService.addGamesToDatabase(games);
    }

}
