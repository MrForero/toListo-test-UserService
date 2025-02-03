package com.example.test.toListo.infrastructure.repository;

import com.example.test.toListo.infrastructure.repository.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, String> {

}
