package com.model;

public class HelperBean {
    private String serviceType;
    private double serviceCostPerHour;
    private int noOfHours;
    private double serviceCost;

    // Getters and Setters
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public double getServiceCostPerHour() {
        return serviceCostPerHour;
    }

    public void setServiceCostPerHour(double serviceCostPerHour) {
        this.serviceCostPerHour = serviceCostPerHour;
    }

    public int getNoOfHours() {
        return noOfHours;
    }

    public void setNoOfHours(int noOfHours) {
        this.noOfHours = noOfHours;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }
}