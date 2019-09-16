package com.cg.trading.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Min;

@Entity
public class Stock {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_gen")
	@SequenceGenerator(name = "id_gen", initialValue = 101, sequenceName = "id_seq")
	@Column(name = "id", updatable = false, nullable = false)	
	private int id;
	private String name;
	@Column
	@Min(1)
	private double price;
	@Column
	@Min(1)
	private int quantity;
	@Column
	private double amount;
	@Column
	private double brokerage;

	public Stock() {
		super();
	}

	public Stock(int id, String name, double price, int quantity, double amount, double brokerage) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.amount = amount;
		this.brokerage = brokerage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBrokerage() {
		return brokerage;
	}

	public void setBrokerage(double brokerage) {
		this.brokerage = brokerage;
	}

	@Override
	public String toString() {
		return "Stock [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", amount="
				+ amount + ", brokerage=" + brokerage + "]";
	}

}
