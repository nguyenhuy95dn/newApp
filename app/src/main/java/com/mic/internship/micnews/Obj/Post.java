package com.mic.internship.micnews.Obj;

/**
 * IDE: Android Studio
 * Created by Nguyen Trong Cong  - 2DEV4U.COM
 * Name packge: com.mic.internship.micnews.Obj
 * Name project: MICNews
 * Date: 1/3/2017
 * Time: 08:09
 */

public class Post {
    int id_post;
    int id_ca;
    String title;
    String description;
    String content;
    String datetime;
    String image;

    public Post(int id_post, int id_ca, String title, String description, String content, String datetime, String image) {
        this.id_post = id_post;
        this.id_ca = id_ca;
        this.title = title;
        this.description = description;
        this.content = content;
        this.datetime = datetime;
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId_post() {
        return id_post;
    }

    public void setId_post(int id_post) {
        this.id_post = id_post;
    }

    public int getId_ca() {
        return id_ca;
    }

    public void setId_ca(int id_ca) {
        this.id_ca = id_ca;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
