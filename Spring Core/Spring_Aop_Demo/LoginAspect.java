package com.spring.app;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Type your code here
@Aspect
// Type your code here
@Component
public class LoginAspect {

	// Type your code here
	@Autowired
	private EasyBank easyBank;

	// Type your code here
	@Around("execution(* com.spring.app.EasyBank.doWithdraw(..))")
	public void validateWithdraw(ProceedingJoinPoint joinPoint) throws Throwable {

		if (easyBank.getTempPin() != easyBank.getPinCode()) {
			throw new Exception();
		} else {
			joinPoint.proceed();
			System.out.println("Your remaining balance is " + (easyBank.getBalance()));

		}

	}

	// Type your code here
	@Before("execution(* com.spring.app.EasyBank.doDeposit(..)) || execution(* com.spring.app.EasyBank.showBalance(..))")
    public void validateBalance() {

		if (easyBank.getTempPin() != easyBank.getPinCode()) {
			throw new RuntimeException();
		}

	}

	// Type your code here
	 @AfterReturning("execution(* com.spring.app.EasyBank.doChangePin(..))")
	public void afterPinChange() {
		System.out.println("You have successfully changed your pin");
	}

	// Type your code here
	 @AfterThrowing("execution(* com.spring.app.EasyBank.*(..))")
	public void afterWrongPin() {
		System.out.println("Invalid Pin");
	}

}