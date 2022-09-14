package com.microservice.services;

import com.microservice.exceptions.GameNotFoundException;
import com.microservice.models.Game;
import com.microservice.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Console;
import java.util.Collection;
import java.util.List;

import static com.microservice.resources.Constants.Messages.GAME_NOT_FOUND;

@Component
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public Game get(Long id) {
        return gameRepository.findById(id).orElseThrow(() -> new GameNotFoundException(GAME_NOT_FOUND));
    }

    public List<Game> getAll() {
        return gameRepository.findAll();
    }

    public void addToDatabase(Collection<Game> games) {
        gameRepository.saveAll(games);
    }
}
