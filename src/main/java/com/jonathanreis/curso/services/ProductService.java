package com.jonathanreis.curso.services;

import com.jonathanreis.curso.entities.Product;
import com.jonathanreis.curso.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {



    @Autowired
    private ProductRepository repository;


    //    retorna todos os usuários
    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }

}

