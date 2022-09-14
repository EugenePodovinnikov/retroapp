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
}
