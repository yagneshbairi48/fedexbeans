package com.example.beans;

import java.util.List;

public class Output {


    private CompleteTrackResults[] completeTrackResults;
    private String alerts;

    public CompleteTrackResults[] getCompleteTrackResults() {
        return completeTrackResults;
    }

    public void setCompleteTrackResults(CompleteTrackResults[] completeTrackResults) {
        this.completeTrackResults = completeTrackResults;
    }

    public String getAlerts() {
        return alerts;
    }

    public void setAlerts(String alerts) {
        this.alerts = alerts;
    }
}
