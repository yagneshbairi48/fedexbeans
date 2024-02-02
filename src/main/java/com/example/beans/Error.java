package com.example.beans;

import java.util.List;

public class Error {
    private String code;
    private ParameterList[] parameterList;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ParameterList[] getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList[] parameterList) {
        this.parameterList = parameterList;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
