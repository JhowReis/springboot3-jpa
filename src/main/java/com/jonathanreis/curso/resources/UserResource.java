package com.jonathanreis.curso.resources;

import com.jonathanreis.curso.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "jonathan", "jonathan@gmail.com", "55280237","98670055");
        return ResponseEntity.ok().body(u);
    }
}
