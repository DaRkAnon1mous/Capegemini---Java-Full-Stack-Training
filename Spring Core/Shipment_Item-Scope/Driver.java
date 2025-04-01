package com.spring.app;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		Item itemObj = (Item) context.getBean("itemObj");
		Shipment shipObj1 = (Shipment) context.getBean("shipObj");
		Item itemObj1 = (Item) context.getBean("itemObj");
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Shipment Details1");
		System.out.println("Enter the Item Name");
		itemObj1.setItemName(sc.nextLine());
		System.out.println("Enter the Item Price");
		itemObj1.setPrice(sc.nextDouble());
		sc.nextLine();
		System.out.println("Enter the ShipmentId");
		shipObj1.setShipmentId(sc.nextLine());
		System.out.println("Enter the Delivery Status");
		shipObj1.setDeliveryStatus(sc.nextLine());
		shipObj1.setItem(itemObj1);
		
		
		Shipment shipObj2 = (Shipment) context.getBean("shipObj");
		Item itemObj2 = (Item) context.getBean("itemObj");
		
		System.out.println("Shipment Details2");
		System.out.println("Enter the Item Name");
		itemObj2.setItemName(sc.nextLine());
		System.out.println("Enter the Item Price");
		itemObj2.setPrice(sc.nextDouble());
		sc.nextLine();
		System.out.println("Enter the ShipmentId");
		shipObj2.setShipmentId(sc.nextLine());
		System.out.println("Enter the Delivery Status");
		shipObj2.setDeliveryStatus(sc.nextLine());
		shipObj2.setItem(itemObj2);
		
		System.out.println("Delivery status of shipment ID: " + shipObj1.getShipmentId()+" is "+shipObj1.getDeliveryStatus());
		System.out.println("Delivery status of shipment ID: " + shipObj2.getShipmentId()+" is "+shipObj2.getDeliveryStatus());
//Fill the code

	}

}
