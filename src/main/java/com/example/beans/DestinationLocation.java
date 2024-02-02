package com.example.beans;

import java.util.List;

public class DestinationLocation {
    private String locationId;

    private LocationContactAndAddress locationContactAndAddress ;
    private String locationType;

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public LocationContactAndAddress getLocationContactAndAddress() {
        return locationContactAndAddress;
    }

    public void setLocationContactAndAddress(LocationContactAndAddress locationContactAndAddress) {
        this.locationContactAndAddress = locationContactAndAddress;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }
}
