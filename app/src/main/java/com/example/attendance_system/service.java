package com.example.attendance_system;

public class service {

    String name,rollno,presenting,date;

    public service() {
    }

    public service(String name, String rollno, String presenting, String date) {
        this.name = name;
        this.rollno = rollno;
        this.presenting = presenting;
        this.date = date;
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

    public String getPresenting() {
        return presenting;
    }

    public void setPresenting(String presenting) {
        this.presenting = presenting;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
