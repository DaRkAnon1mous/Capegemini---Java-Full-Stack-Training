package com.spring.app;

import java.util.Scanner;

import org.springframework.stereotype.Component;

// Type your code here
@Component
public class EasyBank {

	private int pinCode = 6789;
	private int balance = 10000;
	private int tempPin;

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getTempPin() {
		return tempPin;
	}

	public void setTempPin(int tempPin) {
		this.tempPin = tempPin;
	}

	public void doDeposit(int amount) {

		// Type your code here
		balance += amount;
        System.out.println("Your balance is " + balance);
	}

	public void doWithdraw(int amount) {

		// Type your code here
		if (amount <= balance) {
            balance -= amount;
            System.out.println("You have successfully withdrawn " + amount);
        } else {
            System.out.println("Insufficient Fund");
        }

	}

	public void doChangePin(int oldPin, int pin) {

		// Type your code here
		try {
	        if (oldPin == pinCode) {
	            if (pin >= 1000 && pin <= 9999 && pin % 10 != 0) {
	                pinCode = pin;
	            } else {
	                throw new IllegalArgumentException("Invalid New Pin");
	            }
	        } else {
	            throw new IllegalArgumentException("Invalid Old Pin");
	        }
	    } catch (IllegalArgumentException e) {
	        System.out.println(e.getMessage());
	    }
	}

	public void showBalance() {

		// Type your code here
		System.out.println("Your balance is " + balance);
		
	}

}