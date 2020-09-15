package enetities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
	private Integer number;
	private Date date;
	private OrderStatus status;
	
	public Order() {
		
	}
	
	public Order(Integer number, Date date, OrderStatus status) {
		this.number = number;
		this.date = date;
		this.status = status;	
		
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	} 
	
	public OrderStatus getStatus() {
		return status;
	}
	
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Number: " + number + "\nStatus: " + status + "\nDate: " + date;
	}

}









