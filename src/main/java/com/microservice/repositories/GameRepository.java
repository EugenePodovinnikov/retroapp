package com.microservice.repositories;

import com.microservice.models.Console;
import com.microservice.models.Game;
import lombok.NonNull;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface GameRepository extends CrudRepository<Game, Long> {

    @Override
    @NonNull
    List<Game> findAll();

    @Override
    @NonNull
    Optional<Game> findById(@NonNull Long id);
}
