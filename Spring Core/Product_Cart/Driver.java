package com.spring.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String args[]) {
		
		//fill the code
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Cart c = (Cart) context.getBean("c");
		List<Product> list = c.getProductList();
		System.out.println("Sample Output:");
		double sum =0.0;
		for (Product product : list) {
			sum += product.getPrice();
		}
		System.out.println("Total Price Rs: "+sum);

	}
}
