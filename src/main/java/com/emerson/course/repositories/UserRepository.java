package com.emerson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emerson.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
