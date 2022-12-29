package com.myprojects.clients.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myprojects.clients.entity.Address;

public interface RepositoryAddress extends JpaRepository<Address, Long>{
    
}
