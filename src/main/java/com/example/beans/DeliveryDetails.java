package com.example.beans;

import java.util.List;

public class DeliveryDetails {
    private String receivedByName;
    private String destinationServiceArea;
    private String destinationServiceAreaDescription;
    private String v;
    private ActualDeliveryAddress actualDeliveryAddress;
    private boolean deliveryToday;
    private String locationType;
    private String officeOrderDeliveryMethod;

    public String getReceivedByName() {
        return receivedByName;
    }

    public void setReceivedByName(String receivedByName) {
        this.receivedByName = receivedByName;
    }

    public String getDestinationServiceArea() {
        return destinationServiceArea;
    }

    public void setDestinationServiceArea(String destinationServiceArea) {
        this.destinationServiceArea = destinationServiceArea;
    }

    public String getDestinationServiceAreaDescription() {
        return destinationServiceAreaDescription;
    }

    public void setDestinationServiceAreaDescription(String destinationServiceAreaDescription) {
        this.destinationServiceAreaDescription = destinationServiceAreaDescription;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public ActualDeliveryAddress getActualDeliveryAddress() {
        return actualDeliveryAddress;
    }

    public void setActualDeliveryAddress(ActualDeliveryAddress actualDeliveryAddress) {
        this.actualDeliveryAddress = actualDeliveryAddress;
    }

    public boolean isDeliveryToday() {
        return deliveryToday;
    }

    public void setDeliveryToday(boolean deliveryToday) {
        this.deliveryToday = deliveryToday;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public String getOfficeOrderDeliveryMethod() {
        return officeOrderDeliveryMethod;
    }

    public void setOfficeOrderDeliveryMethod(String officeOrderDeliveryMethod) {
        this.officeOrderDeliveryMethod = officeOrderDeliveryMethod;
    }

    public String getDeliveryAttempts() {
        return deliveryAttempts;
    }

    public void setDeliveryAttempts(String deliveryAttempts) {
        this.deliveryAttempts = deliveryAttempts;
    }

    public List<DeliveryOptionEligibilityDetails> getDeliveryOptionEligibilityDetails() {
        return deliveryOptionEligibilityDetails;
    }

    public void setDeliveryOptionEligibilityDetails(List<DeliveryOptionEligibilityDetails> deliveryOptionEligibilityDetails) {
        this.deliveryOptionEligibilityDetails = deliveryOptionEligibilityDetails;
    }

    private String deliveryAttempts;
    private List<DeliveryOptionEligibilityDetails> deliveryOptionEligibilityDetails;
}
