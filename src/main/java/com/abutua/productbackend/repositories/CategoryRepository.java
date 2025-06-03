package com.abutua.productbackend.repositories;

import com.abutua.productbackend.Entities.Category; 

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository  extends JpaRepository <Category, Integer> {
    
}
