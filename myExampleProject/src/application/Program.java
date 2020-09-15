package application;

import java.util.Date;

import enetities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		 
		Order order = new Order(500, new Date(), OrderStatus.SYSTEM_DATA);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.SYSTEM_DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("SYSTEM_DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
		 

	}

}
