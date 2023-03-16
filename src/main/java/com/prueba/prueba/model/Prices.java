package com.prueba.prueba.model;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "prices")
public class Prices {
	
	
	@Column(name = "brand_id")
	private int idBrand;

	@Column(name = "start_date")
	private String start_date;
	
	@Column(name = "end_date")
	private String end_date;
	
	@Id
	@Column(name = "price_list")
	private int price_list;
	
	@Column(name = "product_id")
	private int idProduct;
	
	@Column(name = "priority")
	private int priority;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "curr")
	private String curr;
	
	public Prices() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Prices(int idBrand, String start_date, String end_date, int price_list, int idProduct, int priority,
			double price, String curr) {
		super();
		this.idBrand = idBrand;
		this.start_date = start_date;
		this.end_date = end_date;
		this.price_list = price_list;
		this.idProduct = idProduct;
		this.priority = priority;
		this.price = price;
		this.curr = curr;
	}

	public int getIdBrand() {
		return idBrand;
	}

	public void setIdBrand(int idBrand) {
		this.idBrand = idBrand;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public int getPrice_list() {
		return price_list;
	}

	public void setPrice_list(int price_list) {
		this.price_list = price_list;
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}
	
	

}
