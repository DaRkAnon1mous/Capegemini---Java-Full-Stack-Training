package com.spring.app;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Aspect
@Component 
public class BankAspect {
	final static Logger logger = Logger.getLogger("BankAspect.class");
	
	 @Around("execution(* com.spring.app.Bank.withDraw(..))")
	public Object logTransactionStatus(ProceedingJoinPoint pjp) throws Throwable {
		String currentDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

        
		  logger.info("[" + currentDate + "] Before Method Called:");

	        Object status = pjp.proceed();

	        logger.info("[" + currentDate + "] status" + status);
        return status;
}

	
}