package com.jonathanreis.curso.repositories;

import com.jonathanreis.curso.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
