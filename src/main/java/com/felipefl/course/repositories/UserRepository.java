package com.felipefl.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipefl.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
