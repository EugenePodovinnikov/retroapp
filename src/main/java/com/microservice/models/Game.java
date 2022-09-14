package com.microservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Component
@NoArgsConstructor
@Getter
@Entity
@Table(name="games")
public class Game {

    private static long idCounter = 0;

    public Game(String name) {
        this.name = name;
        setId();
    }

    public synchronized void setId() {
        this.id = ++idCounter;
    }

    @Id
    @Column(name="game_id")
    private long id;

    private String name;

}
