package com.example.way2job.models;

public class User {
    private int id;
    private String name;
    private String rollNo;
    private String collegeName;
    private String email;
    private String course;
    private int year;


    public User(String name, String rollNo, String collegeName, String email, String course, int year) {
        this.name = name;
        this.rollNo = rollNo;
        this.collegeName = collegeName;
        this.email = email;
        this.course = course;
        this.year = year;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", email='" + email + '\'' +
                ", course='" + course + '\'' +
                ", year=" + year +
                '}';
    }


}
