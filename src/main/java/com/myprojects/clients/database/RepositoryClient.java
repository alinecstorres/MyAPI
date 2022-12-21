package com.myprojects.clients.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myprojects.clients.entity.Client;

public interface RepositoryClient extends JpaRepository<Client, Long> {

}
