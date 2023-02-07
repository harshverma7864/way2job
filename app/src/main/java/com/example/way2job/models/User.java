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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
