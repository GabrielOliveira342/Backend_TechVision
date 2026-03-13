package com.project.techvision.services;

import java.util.List;
import java.util.Optional;

import com.project.techvision.domain.User;
import com.project.techvision.repository.UserRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id){
    Optional<User> obj = repo.findById(id);
    return obj.orElseThrow();
    }

    public User insert(User obj){
    return repo.insert(obj);
    }
    
    public void delete(String id){
    repo.deleteById(id);
    }

}