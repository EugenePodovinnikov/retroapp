package com.microservice.repositories;

import com.microservice.models.Console;
import lombok.NonNull;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ConsoleRepository extends CrudRepository<Console, Long> {

    @Override
    @NonNull
    List<Console> findAll();

    @Override
    @NonNull
    Optional<Console> findById(@NonNull Long id);
}
