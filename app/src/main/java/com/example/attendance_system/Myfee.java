package com.example.attendance_system;

public class Myfee {

    String name,rollno,fees,description;

    public Myfee() {
    }

    public Myfee(String name, String rollno, String fees, String description) {
        this.name = name;
        this.rollno = rollno;
        this.fees = fees;
        this.description = description;
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

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
