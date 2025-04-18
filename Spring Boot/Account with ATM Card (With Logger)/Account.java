package com.bean;


import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "account_type", discriminatorType = DiscriminatorType.STRING)
@Table(name = "account")
public abstract class Account implements Serializable {

    @Id
    @Column(name = "account_number")
    private int accountNumber;

    @Column(name = "holder_name")
    private String holderName;

    @Column(name = "balance")
    private double balance;

    @OneToOne(mappedBy = "account", cascade = CascadeType.ALL)
    private ATMCard atmCard;


    public Account() {}

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ATMCard getAtmCard() {
        return atmCard;
    }

    public void setAtmCard(ATMCard atmCard) {
        this.atmCard = atmCard;
    }
}
