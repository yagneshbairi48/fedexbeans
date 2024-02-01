package com.example.beans;

import java.util.List;

public class DestinationLocation {
    private String locationId;

    private List<LocationContactAndAddress> locationContactAndAddress ;
    private String locationType;

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public List<LocationContactAndAddress> getLocationContactAndAddress() {
        return locationContactAndAddress;
    }

    public void setLocationContactAndAddress(List<LocationContactAndAddress> locationContactAndAddress) {
        this.locationContactAndAddress = locationContactAndAddress;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }
}
