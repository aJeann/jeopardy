package com.example.jeopardy.tables;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Axel Jeansson
 * Date: 2021-05-03
 * Time: 20:27
 * Project: jeopardy
 * Copyright: MIT
 */
@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public Game() {
    }

    public Game(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

