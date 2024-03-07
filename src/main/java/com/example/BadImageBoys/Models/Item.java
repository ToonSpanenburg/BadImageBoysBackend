package com.example.BadImageBoys.Models;

import java.util.Date;

public class Item
{
    //an article should have an
    // Writer (links to the user class)
    // Type (for example the Article type should have text, vid should have a video link etc  )
    // Images?

    private int Id;
    private User Writer;
    private String Title;
    private String Description;
    private Date ReleaseDate;

    public Item()
    {
    }

    public Item(int id, User writer, String title, String description, Date releaseDate) {
        Id = id;
        Writer = writer;
        Title = title;
        Description = description;
        ReleaseDate = releaseDate;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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
