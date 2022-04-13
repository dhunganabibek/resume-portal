package com.bibekdhungana;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bibekdhungana.models.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);
}