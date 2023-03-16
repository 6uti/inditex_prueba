package com.prueba.prueba.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Response {
	
	private int idProduct;
	private int idBrand;
	private int price_list;
	private String start_date;
	private String end_date;
	private double price;
	
	/*public Response(int idProduct, int idBrand, int price_list, String start_date, String end_date, double price) {
		super();
		this.idProduct = idProduct;
		this.idBrand = idBrand;
		this.price_list = price_list;
		this.start_date = start_date;
		this.end_date = end_date;
		this.price = price;
	}*/
	
	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	public int getIdBrand() {
		return idBrand;
	}
	public void setIdBrand(int idBrand) {
		this.idBrand = idBrand;
	}
	public int getPrice_list() {
		return price_list;
	}
	public void setPrice_list(int price_list) {
		this.price_list = price_list;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
