package com.example.BadImageBoys.Models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.Date;

@Entity
@DiscriminatorValue("Article")
public class Article extends Item
{
    private byte[] FirstImage;
    private byte[] SecondImage;
    private String Link;

    public Article()
    {

    }

    public Article(int id, User writer, String title, String description, Date releaseDate, byte[] firstImage, byte[] secondImage, String link) {
        super(id, writer, title, description, releaseDate);
        FirstImage = firstImage;
        SecondImage = secondImage;
        Link = link;
    }

    public byte[] getFirstImage() {
        return FirstImage;
    }

    public void setFirstImage(byte[] firstImage) {
        FirstImage = firstImage;
    }

    public byte[] getSecondImage() {
        return SecondImage;
    }

    public void setSecondImage(byte[] secondImage) {
        SecondImage = secondImage;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }
}
