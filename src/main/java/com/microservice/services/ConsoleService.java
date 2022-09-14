package com.microservice.services;

import com.microservice.exceptions.ConsoleNotFoundException;
import com.microservice.models.Console;
import com.microservice.repositories.ConsoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.microservice.resources.Constants.Messages.CONSOLE_NOT_FOUND;

@Component
public class ConsoleService {

    @Autowired
    private ConsoleRepository consoleRepository;

    public Console get(Long id) {
        return consoleRepository.findById(id).orElseThrow(() -> new ConsoleNotFoundException(CONSOLE_NOT_FOUND));
    }

    public List<Console> getAll() {
        return consoleRepository.findAll();
    }
}
