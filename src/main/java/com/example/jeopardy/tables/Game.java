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
    @GeneratedValue
    private long id;
    private String name;
    @ManyToOne
    private Category category;

    public Game() {
    }

    public Game(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategoryList() {
        return category;
    }

    public void setCategoryList(Category category) {
        this.category = category;
    }
}

