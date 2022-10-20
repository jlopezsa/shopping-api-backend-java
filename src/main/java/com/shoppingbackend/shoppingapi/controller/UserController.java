package com.shoppingbackend.shoppingapi.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingbackend.shoppingapi.dto.UserDTO;

@RestController
public class UserController {

    public static List<UserDTO> users = new ArrayList<UserDTO>();

    @PostConstruct
    public void initiateList() {
        UserDTO userA = new UserDTO("Julián", "López", "187672345", "3124532222", new Date());
        UserDTO userB = new UserDTO("Maria", "Perez", "8897654", "3124538888", new Date());
        users.add(userA);
        users.add(userB);
    }

    @GetMapping("/")
    public String getMessage() {
        return "Hello api with Spring Boot!";
    }

    @GetMapping("/users")
    public List<UserDTO> getUsers() {
        return users;
    }

    @GetMapping("/users/{id}")
    public UserDTO getUsersFilter(@PathVariable String id) {
        for (UserDTO singleUser : users) {
            if (singleUser.getId().equals(id))
                return singleUser;
        }
        return null;
    }

    @PostMapping("/new-user")
    public UserDTO createUser(@RequestBody UserDTO newUserDTO) {
        newUserDTO.setRegisterDate(new Date());
        users.add(newUserDTO);
        return newUserDTO;
    }

    @DeleteMapping("users/{id}")
    public String deleteUser(@PathVariable String id) {
        for (UserDTO specificUser : users) {
            if (specificUser.getId().equals(id)) {
                users.remove(specificUser);
                return "User was deleted";
            }
        }
        return "User was not found to delete";
    }
}
