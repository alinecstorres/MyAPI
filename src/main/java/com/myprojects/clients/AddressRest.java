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

import com.myprojects.clients.database.RepositoryAddress;
import com.myprojects.clients.entity.Address;

@RestController
@RequestMapping("/address")
public class AddressRest {
    
    @Autowired
    private RepositoryAddress repositoryAddress;

    @GetMapping("/all")
    public List<Address> showAll() {
        return repositoryAddress.findAll();
    }

    @GetMapping("/id")
    public Optional<Address> findById(Long id) {
        return repositoryAddress.findById(id);
    }

    @PostMapping
    public void saveNew(@RequestBody Address address) {
        repositoryAddress.save(address);
    }

    @PutMapping("/id")
    public void alterOne(@RequestBody Address address) {
        if (address.getId() > 0)
            repositoryAddress.save(address);
    }

    @DeleteMapping("/id")
    public void deleteOne(@RequestBody Address address) {
        repositoryAddress.delete(address);
    }
}
