package com.github.mathan.design_patterns.chainofresponsibility.supportservice;

public class ServiceRequest {
    ServiceLevel serviceLevel;
    String conclusion;

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public ServiceLevel getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

}
