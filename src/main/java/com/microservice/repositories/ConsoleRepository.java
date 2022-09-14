package com.microservice.repositories;

import com.microservice.models.Console;
import com.microservice.models.Game;
import lombok.NonNull;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ConsoleRepository extends CrudRepository<Console, Long> {

    @Override
    @NonNull
    List<Console> findAll();

    @Override
    @NonNull
    Optional<Console> findById(@NonNull Long id);

    @Override
    @NonNull
    <S extends Console> S save(@NonNull S console);
}
