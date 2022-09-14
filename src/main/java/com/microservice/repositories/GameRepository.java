package com.microservice.repositories;

import com.microservice.models.Console;
import com.microservice.models.Game;
import lombok.NonNull;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface GameRepository extends CrudRepository<Game, Long> {

    @Override
    @NonNull
    List<Game> findAll();

    @Override
    @NonNull
    Optional<Game> findById(@NonNull Long id);

    @Override
    @NonNull
    <S extends Game> S save(@NonNull S game);

}
