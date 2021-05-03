package com.example.jeopardy.tables;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
    @OneToMany
    private List<Category> categoryList;

    public Game() {
    }

    public Game(String name, List<Category> categoryList) {
        this.name = name;
        this.categoryList = categoryList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }
}

