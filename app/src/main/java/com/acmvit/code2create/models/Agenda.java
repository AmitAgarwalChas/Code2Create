package com.acmvit.code2create.models;

public class Agenda {
    String agendaTitle;
    String startTime;
    String endTime;
    String date;
    String type;

    public Agenda(String agendaTitle, String startTime, String endTime, String date, String type) {
        this.agendaTitle = agendaTitle;
        this.startTime = startTime;
        this.endTime = endTime;
        this.date = date;
        this.type = type;
    }

    public Agenda() {
    }

    public String getAgendaTitle() {
        return agendaTitle;
    }

    public void setAgendaTitle(String agendaTitle) {
        this.agendaTitle = agendaTitle;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
