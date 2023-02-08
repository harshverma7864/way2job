package com.example.way2job.models;

public class Rounds {
    private int id;
    private int companyId;
    private String roundName;
    private String roundType;
    private int noOfQuestions;
    private int duration;

    public Rounds(int id,int companyId, String roundName, String roundType, int noOfQuestions, int duration) {
        this.id = id;
        this.companyId = companyId;
        this.roundName = roundName;
        this.roundType = roundType;
        this.noOfQuestions = noOfQuestions;
        this.duration = duration;
    }


    @Override
    public String toString() {
        return "Rounds{" +
                "id=" + id +
                ", companyId=" + companyId +
                ", roundName='" + roundName + '\'' +
                ", roundType='" + roundType + '\'' +
                ", noOfQuestions=" + noOfQuestions +
                ", duration=" + duration +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getRoundName() {
        return roundName;
    }

    public void setRoundName(String roundName) {
        this.roundName = roundName;
    }

    public String getRoundType() {
        return roundType;
    }

    public void setRoundType(String roundType) {
        this.roundType = roundType;
    }

    public int getNoOfQuestions() {
        return noOfQuestions;
    }

    public void setNoOfQuestions(int noOfQuestions) {
        this.noOfQuestions = noOfQuestions;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
