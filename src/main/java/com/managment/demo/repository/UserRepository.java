package com.managment.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import student_management_system.entity.User;
import student_management_system.enums.UserRole;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

    User findByRole(UserRole admin);

    Optional<User> findFirstByEmail(String email);
    
}
