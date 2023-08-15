package com.jessiedev.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jessiedev.userdept.entities.User;

public interface UserRepository extends JpaRepository <User, Long>{
    
}
