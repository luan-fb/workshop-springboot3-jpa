package com.luanfaske.courseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luanfaske.courseSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
