package com.spring.app;


 import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.app.Account;

public class Driver {
	
	
	public static Account loadAccount()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        return (Account) context.getBean("accObj");
	}

	public static void main(String[] args) 
	{
		Account acc = loadAccount();
		System.out.println("Account number:"+acc.getAccNumber());
		System.out.println("Account holder name:"+acc.getAccHolderName());
		System.out.println("Balance:"+acc.getAccBalance());
		System.out.println("Loan type:"+acc.getLoanInfo().getLoanType());
		System.out.println("Loan amount:"+acc.getLoanInfo().getLoanAmount());
	}	 	  	    	    		        	 	


}
