package com.myprojects.clients.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myprojects.clients.Service.ClientService;
import com.myprojects.clients.database.RepositoryAddress;
import com.myprojects.clients.database.RepositoryClient;
import com.myprojects.clients.entity.Client;

@Service
public class ClientServiceImpl implements ClientService {

    private RepositoryClient repositoryClient;

    @Autowired
    public ClientServiceImpl(RepositoryClient repositoryClient) {
        this.repositoryClient = repositoryClient;
    }

    @Override
    public Client save(Client client) {
        Client clientdb = this.repositoryClient.save(client);
        return clientdb;
    }

    
    
}
