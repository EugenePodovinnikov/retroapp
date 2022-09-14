package com.microservice.exceptions;

public class ConsoleNotFoundException extends RuntimeException {

    public ConsoleNotFoundException(String message) {
        super(message);
    }
}
