package com.jonathanreis.curso.repositories;

import com.jonathanreis.curso.entities.OrderItem;
import com.jonathanreis.curso.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
