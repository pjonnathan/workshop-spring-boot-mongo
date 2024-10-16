package com.pjonnathan.workshopmongo.services;

import com.pjonnathan.workshopmongo.domain.User;
import com.pjonnathan.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> fildAll(){
        return repo.findAll();
    }
}
