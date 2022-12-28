package com.myprojects.clients.database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.myprojects.clients.entity.Client;

public interface RepositoryClient extends JpaRepository<Client, Long> {

    @Query("SELECT AVG(salary) FROM Client")
    Float findAvgSalary();

    @Query(value = "SELECT * FROM Client WHERE (DATEDIFF(CURRENT_DATE(),BIRTH_DATE) / 365.25) > 21 AND salary > 2000 ORDER BY name ASC", nativeQuery = true)
    List<Client> findOver21();
}
