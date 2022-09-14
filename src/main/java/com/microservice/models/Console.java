package com.microservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Getter
public class Console {

    private String name;

    private LocalDate startOfSales;

    private LocalDate endOfSales;

    private String description;

    private List<String> comments;
}
