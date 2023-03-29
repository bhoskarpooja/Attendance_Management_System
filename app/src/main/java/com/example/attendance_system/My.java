package com.example.attendance_system;

public class My {

    String name,rollno,imageurl;

    public My() {
    }

    public My(String name, String rollno, String imageurl) {
        this.name = name;
        this.rollno = rollno;
        this.imageurl = imageurl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
}
