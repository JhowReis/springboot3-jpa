package com.jonathanreis.curso.repositories;

import com.jonathanreis.curso.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {
}
