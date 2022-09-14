package com.microservice.models;

import com.microservice.exceptions.GameNotFoundException;
import com.microservice.repositories.ConsoleRepository;
import com.microservice.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.ConcurrencyFailureException;

import java.util.Optional;

import static com.microservice.resources.Constants.Messages.CONSOLE_NOT_FOUND;
import static com.microservice.resources.Constants.Messages.GAME_NOT_FOUND;

public class EntityManager<T> {

    @Autowired
    private ConsoleRepository consoleRepository;

    @Autowired
    private GameRepository gameRepository;

    public void save(T t) {
        if (t instanceof Game) {
            gameRepository.save((Game) t);
        } else if (t instanceof Console) {
            consoleRepository.save((Console) t);
        }
    }

    @SuppressWarnings("unchecked")
    public T get(T t, long id) {
        if (t instanceof Game) {
            return (T) gameRepository.findById(id).orElseThrow(() -> new GameNotFoundException(GAME_NOT_FOUND));
        } else if (t instanceof Console) {
            return (T) consoleRepository.findById(id).orElseThrow(() -> new ConcurrencyFailureException(CONSOLE_NOT_FOUND));
        }
        return (T) Optional.empty();
    }
}
