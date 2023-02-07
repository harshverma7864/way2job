package com.example.way2job.models;

public class Information {
    private int id;
    private String collegeName;
    private String companyName;
    private String companytype;
    private Double ctc;
    private String roleOffered;
    private int yearOfVisit;
    private String logo;
    private int noOfRounds;
    private String techStack;
    private String location;

    public Information(String roleOffered,int id ,String collegeName, String companyName, String companytype, Double ctc, int yearOfVisit, String logo, int noOfRounds, String techStack, String location) {
        this.id = id;
        this.roleOffered = roleOffered;
        this.collegeName = collegeName;
        this.companyName = companyName;
        this.companytype = companytype;
        this.ctc = ctc;
        this.yearOfVisit = yearOfVisit;
        this.logo = logo;
        this.noOfRounds = noOfRounds;
        this.techStack = techStack;
        this.location = location;
    }

    public String getRoleOffered() {
        return roleOffered;
    }

    public void setRoleOffered(String roleOffered) {
        this.roleOffered = roleOffered;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanytype() {
        return companytype;
    }

    public void setCompanytype(String companytype) {
        this.companytype = companytype;
    }

    public Double getCtc() {
        return ctc;
    }

    public void setCtc(Double ctc) {
        this.ctc = ctc;
    }

    public int getYearOfVisit() {
        return yearOfVisit;
    }

    public void setYearOfVisit(int yearOfVisit) {
        this.yearOfVisit = yearOfVisit;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getNoOfRounds() {
        return noOfRounds;
    }

    public void setNoOfRounds(int noOfRounds) {
        this.noOfRounds = noOfRounds;
    }

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }
}
