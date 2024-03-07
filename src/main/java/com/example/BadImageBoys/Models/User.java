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
    private Long UserId;
    private String Username;

    //UserType (check later for security reasons)
    //mail
    //encrypted password

    public User(){}

    public User(String username)
    {
        super();
        this.Username = username;
    }

    public long getId()
    {
        return UserId;
    }
    public void setId(long id)
    {
        this.UserId = id;
    }
    public  String getUsername()
    {
        return Username;
    }
    public void setUsername(String username)
    {
        this.Username = username;
    }

    public String ToString()
    {
        return UserId + " " + Username;
    }
}
