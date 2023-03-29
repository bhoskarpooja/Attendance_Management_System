package com.example.attendance_system;

public class Time {

    String year,department,imageurl;

    public Time() {
    }

    public Time(String year, String department, String imageurl) {
        this.year = year;
        this.department = department;
        this.imageurl = imageurl;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
}
