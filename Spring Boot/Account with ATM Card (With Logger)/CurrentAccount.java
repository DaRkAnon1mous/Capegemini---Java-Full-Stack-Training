package com.bean;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("CURR")
public class CurrentAccount extends Account {

    @Column(name = "odlimit")
    private double ODLimit;

    public CurrentAccount() {}

    public double getODLimit() {
        return ODLimit;
    }

    public void setODLimit(double ODLimit) {
        this.ODLimit = ODLimit;
    }
}
