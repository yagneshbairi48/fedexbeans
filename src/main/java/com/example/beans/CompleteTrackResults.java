package com.example.beans;

import java.util.List;

public class CompleteTrackResults {
    private String getTrackingNumber() {
        return trackingNumber;
    }

    private void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    private List<TrackResults> getTrackResults() {
        return trackResults;
    }

    private void setTrackResults(List<TrackResults> trackResults) {
        this.trackResults = trackResults;
    }

    private String trackingNumber;
    private List<TrackResults> trackResults;
}
