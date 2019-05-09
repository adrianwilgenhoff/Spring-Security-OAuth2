package com.aew.users.repository;

import java.util.Optional;

import com.aew.users.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findById(Long id);

    Optional<User> findByEmail(String email);

    Boolean existsByEmail(String email);

}