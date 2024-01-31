package com.example.beans;

import java.util.List;

public class Output {


    private List<CompleteTrackResults> completeTrackResults;
    private List<Alerts> alerts;

    public List<CompleteTrackResults> getCompleteTrackResults() {
        return completeTrackResults;
    }

    public void setCompleteTrackResults(List<CompleteTrackResults> completeTrackResults) {
        this.completeTrackResults = completeTrackResults;
    }

    public List<Alerts> getAlerts() {
        return alerts;
    }

    public void setAlerts(List<Alerts> alerts) {
        this.alerts = alerts;
    }
}
