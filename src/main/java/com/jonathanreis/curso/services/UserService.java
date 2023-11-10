package com.jonathanreis.curso.services;

import com.jonathanreis.curso.entities.User;
import com.jonathanreis.curso.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

//    @Autowired Cria a injeção de dependencia
    @Autowired
    private UserRepository userRepository;


//    retorna todos os usuários
    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = userRepository.findById(id);
        return obj.get();
    }


//    inseri no banco um novo objeto do tipo user
    public User insert(User obj) {
        return userRepository.save(obj);
    }

    public void delete(Long id){
        userRepository.deleteById(id);
    }


}
