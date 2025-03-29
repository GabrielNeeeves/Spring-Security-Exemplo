package com.ganeves.SpringSecEx.service;

import com.ganeves.SpringSecEx.model.Users;
import com.ganeves.SpringSecEx.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    public Users register(Users user) {
        return repo.save(user);
    }

}
