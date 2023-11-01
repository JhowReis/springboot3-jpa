package com.jonathanreis.curso.repositories;

import com.jonathanreis.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository  extends JpaRepository<User, Long> {
}
