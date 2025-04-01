package com.spring.dao;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
@Aspect
public class PointCutDemo {
	@Pointcut("execution(* com.spring.dao.FlightDAO.bookFlight(..))")
    public void transactionPointcut() {} 

}
