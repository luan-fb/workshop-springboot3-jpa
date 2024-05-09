package com.luanfaske.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luanfaske.courseSpring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
