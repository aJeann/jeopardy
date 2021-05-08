package com.example.jeopardy.repositories;

import com.example.jeopardy.tables.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Axel Jeansson
 * Date: 2021-05-06
 * Time: 20:56
 * Project: jeopardy
 * Copyright: MIT
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
    public List<Category> findAllByOrderByIdAsc();
}
