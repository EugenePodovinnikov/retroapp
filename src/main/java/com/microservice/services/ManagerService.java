package com.microservice.services;

import com.microservice.models.Console;
import com.microservice.models.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class ManagerService {

    @Autowired
    private ConsoleService consoleService;

    @Autowired
    private GameService gameService;

    public void addConsolesToDatabase(Collection<Console> consoles) {

    }

    public void addGamesToDatabase(Collection<Game> games) {
        gameService.addToDatabase(games);
    }

}
