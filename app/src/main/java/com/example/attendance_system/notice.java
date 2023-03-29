package com.example.attendance_system;

public class notice {

    String subject1,syllabus1,subject2,syllabus2;

    public notice() {
    }

    public notice(String subject1, String syllabus1, String subject2, String syllabus2) {
        this.subject1 = subject1;
        this.syllabus1 = syllabus1;
        this.subject2 = subject2;
        this.syllabus2 = syllabus2;
    }

    public String getSubject1() {
        return subject1;
    }

    public void setSubject1(String subject1) {
        this.subject1 = subject1;
    }

    public String getSyllabus1() {
        return syllabus1;
    }

    public void setSyllabus1(String syllabus1) {
        this.syllabus1 = syllabus1;
    }

    public String getSubject2() {
        return subject2;
    }

    public void setSubject2(String subject2) {
        this.subject2 = subject2;
    }

    public String getSyllabus2() {
        return syllabus2;
    }

    public void setSyllabus2(String syllabus2) {
        this.syllabus2 = syllabus2;
    }
}
