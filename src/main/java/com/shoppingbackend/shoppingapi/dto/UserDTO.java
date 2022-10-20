package com.shoppingbackend.shoppingapi.dto;

import java.util.Date;

public class UserDTO {
    private String name;
    private String surname;
    private String id;
    private String celphone;
    private Date registerDate;

    public UserDTO(String name, String surname, String id, String celphone, Date registerDate) {
        this.name = name;
        this.surname = surname;
        this.id = id;
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

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
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

}
