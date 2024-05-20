package com.luanfaske.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luanfaske.courseSpring.entities.OrderItem;
import com.luanfaske.courseSpring.entities.pk.OrderitemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem,  OrderitemPK>{

}
