package com.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Flat {

    @Id
    private String flatId;
    private int doorNumber;
    private String flatType;
    private double flatArea;
    private int numberOfRooms;
    private double flatPrice;

    @ManyToOne
    @JoinColumn(name = "buyerid", nullable = false) // Ensures that the buyerid column is created in the flat table
    private Buyer buyer;

    public String getFlatId() {
        return flatId;
    }

    public void setFlatId(String flatId) {
        this.flatId = flatId;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public String getFlatType() {
        return flatType;
    }

    public void setFlatType(String flatType) {
        this.flatType = flatType;
    }

    public double getFlatArea() {
        return flatArea;
    }

    public void setFlatArea(double flatArea) {
        this.flatArea = flatArea;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getFlatPrice() {
        return flatPrice;
    }

    public void setFlatPrice(double flatPrice) {
        this.flatPrice = flatPrice;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }
}