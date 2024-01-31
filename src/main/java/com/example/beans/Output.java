package com.example.beans;

import java.util.List;

public class Output {
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

    public List<CompleteTrackResults> completeTrackResults;
    public List<Alerts> alerts;
}
