package com.example.beans;

import java.util.List;

public class ConsolidationDetail {
    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getConsolidationID() {
        return consolidationID;
    }

    public void setConsolidationID(String consolidationID) {
        this.consolidationID = consolidationID;
    }

    public List<ReasonDetail> getReasonDetail() {
        return reasonDetail;
    }

    public void setReasonDetail(List<ReasonDetail> reasonDetail) {
        this.reasonDetail = reasonDetail;
    }

    public int getPackageCount() {
        return packageCount;
    }

    public void setPackageCount(int packageCount) {
        this.packageCount = packageCount;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    private String timeStamp;
    private String consolidationID;
    private List<ReasonDetail> reasonDetail;

    private int packageCount;
    private String eventType;

}
