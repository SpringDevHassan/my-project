package com.hassan.MyProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hassan.MyProject.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}