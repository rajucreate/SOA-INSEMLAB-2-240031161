package com.insemlab;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public List<User> getUsers() {
        return List.of(new User(1, "Raju"), new User(2, "Abhi"), new User(2,"Reddy"));
    }
}
