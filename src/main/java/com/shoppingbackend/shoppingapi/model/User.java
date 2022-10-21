package com.shoppingbackend.shoppingapi.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.shoppingbackend.shoppingapi.dto.UserDTO;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String identificationCard;
    private String celphone;
    private Date registerDate;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdentificationCard() {
        return this.identificationCard;
    }

    public void setIdentificationCard(String identificationCard) {
        this.identificationCard = identificationCard;
    }

    public String getCelphone() {
        return this.celphone;
    }

    public void setCelphone(String celphone) {
        this.celphone = celphone;
    }

    public Date getRegisterDate() {
        return this.registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    // convert method change the User entity instance to a instances of UserDTO
    // class
    // UserDTO --> User
    public static User convert(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setSurname(userDTO.getSurname());
        user.setIdentificationCard(userDTO.getIdentificationCard());
        user.setCelphone(userDTO.getCelphone());
        user.setRegisterDate(userDTO.getRegisterDate());

        return user;
    }

}
