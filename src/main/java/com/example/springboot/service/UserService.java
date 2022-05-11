package com.example.springboot.service;


import com.example.springboot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void add(User user);

    User getUserById(int id);

    void delete(int id);
}
