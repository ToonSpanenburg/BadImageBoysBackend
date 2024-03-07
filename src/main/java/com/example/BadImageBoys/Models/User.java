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
    private Long Id;
    private String Username;

    //UserType (check later for security reasons)
    //mail
    //encrypted password

    public User(){}

    public User(long id, String username)
    {
        super();
        this.Id = id;
        this.Username = username;
    }

    public long getId()
    {
        return Id;
    }
    public void setId(long id)
    {
        this.Id = id;
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
        return Id + " " + Username;
    }
}
