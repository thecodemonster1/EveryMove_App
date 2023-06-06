package com.example.everymovethecodemonsterpartapp;

public class model {
    String name, course, email, purl;

//    model(){
//
//    }

    public model(String name, String course, String email, String purl){
        this.name = name;
        this.course = course;
        this.email = email;
        this.purl = purl;
    }

    public String getName(){
        return name;
    }

    public String setName(String name){this.name = name;
        return name;
    }

    public String getCourse(){
        return course;
    }

    public String setCourse(String course){
        this.course = course;
        return course;
    }

    public String getEmail(){
        return email;
    }

    public String setEmail(String email){
        this.email = email;
        return email;
    }

    public String getPurl(){
        return purl;
    }

    public String setPurl(String purl){
        this.purl = purl;
        return purl;
    }

}
