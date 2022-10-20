package com.shoppingbackend.shoppingapi.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingbackend.shoppingapi.dto.UserDTO;

@RestController
public class UserController {

    public static List<UserDTO> users = new ArrayList<UserDTO>();

    @PostConstruct
    public void initiateList() {
        UserDTO userA = new UserDTO("Julián", "López", "187672345", "3124532222", new Date());
        users.add(userA);
    }

    @GetMapping("/")
    public String getMessage() {
        return "Hello Spring Boot!";
    }

    @GetMapping("/users")
    public List<UserDTO> getUsers() {
        return users;
    }
}
