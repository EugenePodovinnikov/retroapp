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
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name="games")
public class Game {

    @Id
    @Column(name="game_id")
    private long gameId;

    private String name;

}
