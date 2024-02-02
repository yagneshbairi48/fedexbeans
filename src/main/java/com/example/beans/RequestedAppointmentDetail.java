package com.example.beans;

public class RequestedAppointmentDetail {
    private String date;
    private Windows[] window;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Windows[] getWindow() {
        return window;
    }

    public void setWindow(Windows[] window) {
        this.window = window;
    }
}