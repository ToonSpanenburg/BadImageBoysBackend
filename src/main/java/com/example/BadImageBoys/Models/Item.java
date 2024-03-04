package com.example.BadImageBoys.Models;

public class Item
{
    //an article should have an
    // Writer (links to the user class)
    // Type (for example the Article type should have text, vid should have a video link etc  )
    // Release date
    // Images?


    //docker run --name mysql -e MYSQL_ROOT_PASSWORD=admin -d mysql:tag

    //O&Z40V658O:;5;Q9/i&tqDKw?8qa%Kjs

    //CREATE USER 'admin2'@'%' IDENTIFIED BY 'password';


    private int Id;
    private User Writer;


    private String Title;
    private String Description;

    public String ToString()
    {
        return "";
    }
}
