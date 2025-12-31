package com.kh.chap02.objectArray.model.vo;

public class Phone {
	private String name;
	private String series;
	private String brand;
	private int price;
	
	public Phone(){
		
	}
	
	public Phone(String name, String series, String brand, int price) {
		this.name = name;
		this.series = series;
		this.brand = brand;
		this.price = price;
		//           전역변수
	}

	public int getPrice() {
		return price;
	}
 
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String information() {
		return name+", "+series+", "+brand+", "+price;
	}
}
