package com.example.beans;

import java.util.List;

public class LatestStatusDetail {
    private List<ScanLocation> scanLocation;
    private String code;
    private String derivedCode;
    private List<AncillaryDetails> ancillaryDetails;
    private String statusByLocale;
    private String description;
    private List<DelayDetail> delayDetail;

    public List<ScanLocation> getScanLocation() {
        return scanLocation;
    }

    public void setScanLocation(List<ScanLocation> scanLocation) {
        this.scanLocation = scanLocation;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDerivedCode() {
        return derivedCode;
    }

    public void setDerivedCode(String derivedCode) {
        this.derivedCode = derivedCode;
    }

    public List<AncillaryDetails> getAncillaryDetails() {
        return ancillaryDetails;
    }

    public void setAncillaryDetails(List<AncillaryDetails> ancillaryDetails) {
        this.ancillaryDetails = ancillaryDetails;
    }

    public String getStatusByLocale() {
        return statusByLocale;
    }

    public void setStatusByLocale(String statusByLocale) {
        this.statusByLocale = statusByLocale;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<DelayDetail> getDelayDetail() {
        return delayDetail;
    }

    public void setDelayDetail(List<DelayDetail> delayDetail) {
        this.delayDetail = delayDetail;
    }
}
