package com.luanfaske.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luanfaske.courseSpring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
