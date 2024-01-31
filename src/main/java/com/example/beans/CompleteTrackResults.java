package com.example.beans;

public class CompleteTrackResults {
    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public List<TrackResults> getTrackResults() {
        return trackResults;
    }

    public void setTrackResults(List<TrackResults> trackResults) {
        this.trackResults = trackResults;
    }

    public String trackingNumber;
    public List<TrackResults> trackResults;
}
