package com.microservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name="consoles")
public class Console {

    private static long idCounter = 0;

    public Console(String name) {
        this.name = name;
        setId();
    }

    public synchronized void setId() {
        this.id = ++idCounter;
    }

    @Id
    @Column(name="console_id")
    private long id;

    private String name;

    @Column(name = "photo_url")
    private String photoUrl;

    private String description;

    private String sold;

    @Column(name = "best_games")
    private String bestGameIds;
}
