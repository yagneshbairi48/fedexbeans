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
    private String deliveryAttempts;
    private List<DeliveryOptionEligibilityDetails> deliveryOptionEligibilityDetails;
}
