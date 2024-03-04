package com.example.BadImageBoys.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String username;

    //UserType (check later for security reasons)
    //mail
    //encrypted password

    public User(){}

    public User(long Id, String Username)
    {
        super();
        this.id = Id;
        this.username = Username;
    }

    public long getId()
    {
        return id;
    }
    public void setId(long Id)
    {
        this.id = Id;
    }
    public  String getUsername()
    {
        return username;
    }
    public void setUsername(String Username)
    {
        this.username = Username;
    }
}
