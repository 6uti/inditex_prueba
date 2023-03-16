package com.prueba.prueba.model;

public class Request {
	private String apply_date;
	private int product_id;
	private int brand_id;
	
	public Request(String apply_date, int product_id, int brand_id) {
		super();
		this.apply_date = apply_date;
		this.product_id = product_id;
		this.brand_id = brand_id;
	}
	
	public String getApply_date() {
		return apply_date;
	}
	public void setApply_date(String apply_date) {
		this.apply_date = apply_date;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}
	
	

}
