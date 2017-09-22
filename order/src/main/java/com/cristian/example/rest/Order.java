package com.cristian.example.rest;

import java.util.Date;

public class Order {
	private long id;
	private long amount;
	private Date dateOrder;
	private Client customer;
	private Product product;
	public long getId() {
	return id;
	}
	public void setId(long id) {
	this.id = id;
	}
	public long getAmount() {
	return amount;
	}
	public void setAmount(long amount) {
	this.amount = amount;}
	public Date getDateOrder() {
	return dateOrder;
	}
	public void setDateOrder(Date dateOrder) {
	this.dateOrder = dateOrder;
	}
	public Client getCustomer() {
	return customer;
	}
	public void setCustomer(Client customer) {
	this.customer = customer;
	}
	public Product getProduct() {
	return product;
	}
	public void setProduct(Product product) {
	this.product = product;
	}

}
