package com.spring.app;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static GoldRateInfo loadGoldRateDetails() {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		return (GoldRateInfo) context.getBean("rateInfoObj");
				
	}
	
public static void main(String[] args){
	
	Scanner in=new Scanner(System.in);
	//fill the code
	System.out.println("Enter the carat:");
	int c = in.nextInt();
	System.out.println("Enter Total Grams:");
	double d = in.nextDouble();
	GoldRateInfo rateInfoObj = loadGoldRateDetails();
	System.out.println("Total Gold Rate is Rs:"+rateInfoObj.calculateGoldRate(c, d));
	
	
	
}

}
	 	  	    	    		        	 	
