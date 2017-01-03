package com.mic.internship.micnews.Obj;

/**
 * IDE: Android Studio
 * Created by Nguyen Trong Cong  - 2DEV4U.COM
 * Name packge: com.mic.internship.micnews.Obj
 * Name project: MICNews
 * Date: 1/3/2017
 * Time: 08:09
 */

public class Category {
    int id_ca;
    String name_ca;

    public Category(int id_ca, String name_ca) {
        this.id_ca = id_ca;
        this.name_ca = name_ca;
    }

    public String getName_ca() {
        return name_ca;
    }

    public void setName_ca(String name_ca) {
        this.name_ca = name_ca;
    }

    public int getId_ca() {
        return id_ca;
    }

    public void setId_ca(int id_ca) {
        this.id_ca = id_ca;
    }
}
