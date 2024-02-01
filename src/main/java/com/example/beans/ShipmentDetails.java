package com.example.beans;

import java.util.List;

public class ShipmentDetails {
    private List<Contents> contents;
    private Boolean beforePossessionStatus;
    private List<Weight> weight;
    private String contentPieceCount;
    private List<SplitShipments> splitShipments;

    public List<Contents> getContents() {
        return contents;
    }

    public void setContents(List<Contents> contents) {
        this.contents = contents;
    }

    public Boolean getBeforePossessionStatus() {
        return beforePossessionStatus;
    }

    public void setBeforePossessionStatus(Boolean beforePossessionStatus) {
        this.beforePossessionStatus = beforePossessionStatus;
    }

    public List<Weight> getWeight() {
        return weight;
    }

    public void setWeight(List<Weight> weight) {
        this.weight = weight;
    }

    public String getContentPieceCount() {
        return contentPieceCount;
    }

    public void setContentPieceCount(String contentPieceCount) {
        this.contentPieceCount = contentPieceCount;
    }

    public List<SplitShipments> getSplitShipments() {
        return splitShipments;
    }

    public void setSplitShipments(List<SplitShipments> splitShipments) {
        this.splitShipments = splitShipments;
    }
}
