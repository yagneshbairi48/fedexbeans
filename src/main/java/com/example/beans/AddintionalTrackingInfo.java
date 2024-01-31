package com.example.beans;

import java.util.List;

public class AddintionalTrackingInfo {
    private boolean hasAssociatedShipments;
    private String nickname;
    private List<PackageIdentifiers> packageIdentifiers;

    private String shipmentNotes;

    public boolean isHasAssociatedShipments() {
        return hasAssociatedShipments;
    }

    public void setHasAssociatedShipments(boolean hasAssociatedShipments) {
        this.hasAssociatedShipments = hasAssociatedShipments;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List<PackageIdentifiers> getPackageIdentifiers() {
        return packageIdentifiers;
    }

    public void setPackageIdentifiers(List<PackageIdentifiers> packageIdentifiers) {
        this.packageIdentifiers = packageIdentifiers;
    }

    public String getShipmentNotes() {
        return shipmentNotes;
    }

    public void setShipmentNotes(String shipmentNotes) {
        this.shipmentNotes = shipmentNotes;
    }
}
