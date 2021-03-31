package com.example.estudo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.estudo.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
