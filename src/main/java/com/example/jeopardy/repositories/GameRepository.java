package com.example.jeopardy.repositories;

import com.example.jeopardy.tables.Category;
import com.example.jeopardy.tables.Game;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Axel Jeansson
 * Date: 2021-05-06
 * Time: 20:56
 * Project: jeopardy
 * Copyright: MIT
 */
public interface GameRepository extends CrudRepository<Game, Long> {
}
