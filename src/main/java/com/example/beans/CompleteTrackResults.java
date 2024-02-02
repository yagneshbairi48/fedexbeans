package com.example.beans;

import java.util.List;

public class CompleteTrackResults {
    private String getTrackingNumber() {
        return trackingNumber;
    }

    private void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    private TrackResults[] getTrackResults() {
        return trackResults;
    }

    private void setTrackResults(TrackResults[] trackResults) {
        this.trackResults = trackResults;
    }

    private String trackingNumber;
    private TrackResults[] trackResults;
}
