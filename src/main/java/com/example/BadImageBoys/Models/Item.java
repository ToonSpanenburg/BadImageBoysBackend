package com.example.BadImageBoys.Models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Item
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    @ManyToOne
    @JoinColumn(name = "UserId")
    private User Writer;
    private String Title;
    private String Description;
    private Date ReleaseDate;

    public Item()
    {
    }

    public Item(User writer, String title, String description, Date releaseDate)
    {
        Writer = writer;
        Title = title;
        Description = description;
        ReleaseDate = releaseDate;
    }

    public long getId() {
        return Id;
    }

    public User getWriter() {
        return Writer;
    }

    public void setWriter(User writer) {
        Writer = writer;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Date getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        ReleaseDate = releaseDate;
    }

    public String ToString()
    {
        return Id + " " + Title;
    }
}
