package com.example.ThinkOn_Danni_Huang.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ThinkOn_Danni_Huang.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

