package com.salesSmarts1.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesSmarts1.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByEmail(String email);
    Optional<User> findByUsername(String username);
}

