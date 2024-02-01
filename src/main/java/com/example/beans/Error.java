package com.example.beans;

import java.util.List;

public class Error {
    private String code;
    private List<ParameterList> parameterList;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<ParameterList> getParameterList() {
        return parameterList;
    }

    public void setParameterList(List<ParameterList> parameterList) {
        this.parameterList = parameterList;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
