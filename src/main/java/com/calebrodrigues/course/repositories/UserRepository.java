package com.calebrodrigues.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.calebrodrigues.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
