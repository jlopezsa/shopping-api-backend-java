package com.shoppingbackend.shoppingapi.dto;

import java.util.Date;

import com.shoppingbackend.shoppingapi.model.User;

public class UserDTO {
    private String name;
    private String surname;
    private String identificationCard;
    private String celphone;
    private Date registerDate;

    public UserDTO() {
    }

    public UserDTO(String name, String surname, String identificationCard, String celphone, Date registerDate) {
        this.name = name;
        this.surname = surname;
        this.identificationCard = identificationCard;
        this.celphone = celphone;
        this.registerDate = registerDate;
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

    // User --> UserDTO
    public static UserDTO convert(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setName(user.getName());
        userDTO.setSurname(user.getSurname());
        userDTO.setIdentificationCard(user.getIdentificationCard());
        userDTO.setCelphone(user.getCelphone());
        userDTO.setRegisterDate(user.getRegisterDate());

        return userDTO;
    }

}
