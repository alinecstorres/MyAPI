package com.myprojects.clients.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.myprojects.clients.entity.Client;

public interface RepositoryClient extends JpaRepository<Client, Long> {

    @Query("SELECT AVG(salary) FROM Client")
    Float findAvgSalary();
}
