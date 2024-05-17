package com.luanfaske.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luanfaske.courseSpring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
