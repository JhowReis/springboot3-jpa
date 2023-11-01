package com.jonathanreis.curso.services;

import com.jonathanreis.curso.entities.Category;
import com.jonathanreis.curso.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

//    @Autowired Cria a injeção de dependencia
    @Autowired
    private CategoryRepository categoryRepository;


//    retorna todos os usuários
    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.get();
    }

}
