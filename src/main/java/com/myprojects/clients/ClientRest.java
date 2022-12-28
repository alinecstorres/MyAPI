package com.myprojects.clients;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myprojects.clients.database.RepositoryClient;
import com.myprojects.clients.entity.Client;

@RestController
@RequestMapping("/clients")
public class ClientRest {

    @Autowired
    private RepositoryClient repositoryClient;

    @GetMapping("/all")
    public List<Client> showAll() {
        return repositoryClient.findAll();
    }

    @GetMapping("/id")
    public Optional<Client> findById(Long id) {
        return repositoryClient.findById(id);
    }

    @GetMapping("/values")
    public Float getAvgSalary() {
        return repositoryClient.findAvgSalary();
    }

    @PostMapping
    public void saveNew(@RequestBody Client client) {
        repositoryClient.save(client);
    }

    @PutMapping("/id")
    public void alterOne(@RequestBody Client client) {
        if (client.getId() > 0)
            repositoryClient.save(client);
    }

    @DeleteMapping("/id")
    public void deleteOne(@RequestBody Client client) {
        repositoryClient.delete(client);
    }
}
