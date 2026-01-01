package com.kh.chap01.before.model.vo;

public class Smartphone {
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private String mobileAgency;
	
	public Smartphone() {
	}
	
	public Smartphone(String brand, String pCode, String pName, int price, String mobileAgency) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.mobileAgency = mobileAgency;
	}
}
