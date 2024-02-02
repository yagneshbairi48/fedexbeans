package com.example.beans;

import java.util.List;

public class AdditionalTrackingInfo {
    private boolean hasAssociatedShipments;
    private String nickname;
    private PackageIdentifiers[] packageIdentifiers;

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

    public PackageIdentifiers[] getPackageIdentifiers() {
        return packageIdentifiers;
    }

    public void setPackageIdentifiers(PackageIdentifiers[] packageIdentifiers) {
        this.packageIdentifiers = packageIdentifiers;
    }

    public String getShipmentNotes() {
        return shipmentNotes;
    }

    public void setShipmentNotes(String shipmentNotes) {
        this.shipmentNotes = shipmentNotes;
    }
}
