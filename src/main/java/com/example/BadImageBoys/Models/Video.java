package com.example.BadImageBoys.Models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue("Video")
public class Video extends Item
{
    private String VideoLink;
    private String Link;

    public Video() {
    }

    public Video(int id, User writer, String title, String description, Date releaseDate, String videoLink, String link) {
        super(id, writer, title, description, releaseDate);
        VideoLink = videoLink;
        Link = link;
    }

    public String getVideoLink() {
        return VideoLink;
    }

    public void setVideoLink(String videoLink) {
        VideoLink = videoLink;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }
}
