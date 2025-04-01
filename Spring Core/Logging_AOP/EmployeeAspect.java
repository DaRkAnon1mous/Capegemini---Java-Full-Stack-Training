package com.spring.app;




import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAspect {
	

final static Logger logger =Logger.getLogger("EmployeeAspect.class");

	
	
@After("execution(* Company.registerEmployee(..))")
public void logRegistrationStatus(){
		
	String currentDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

    // Log the date and success message
    logger.info("[" + currentDate + "] Registration Successful");




	}
	
	
}