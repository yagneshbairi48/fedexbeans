package com.example.beans;

import java.util.List;

public class ReturnDetail {
    private String authorizationName;
    private List<ReasonDetail> reasonDetail;

    public String getAuthorizationName() {
        return authorizationName;
    }

    public void setAuthorizationName(String authorizationName) {
        this.authorizationName = authorizationName;
    }

    public List<ReasonDetail> getReasonDetail() {
        return reasonDetail;
    }

    public void setReasonDetail(List<ReasonDetail> reasonDetail) {
        this.reasonDetail = reasonDetail;
    }
}
