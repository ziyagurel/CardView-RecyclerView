package com.zahitziyagurel.cardview_recyclerview.Value;

public class person {
    private String name;
    private String age;
    private int photo_id;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public int getPhoto_id() {
        return photo_id;
    }

    public person(String name, String age, int photo_id) {
        this.name = name;
        this.age = age;
        this.photo_id = photo_id;
    }
    public person(){

    }
}
