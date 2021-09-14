package com.company;

public class VahidException extends Exception {
    private String khar;

    public VahidException(String message,String khar) {
        super(message);
        this.khar = khar;
    }

    public String getKhar() {
        return khar;
    }
}
