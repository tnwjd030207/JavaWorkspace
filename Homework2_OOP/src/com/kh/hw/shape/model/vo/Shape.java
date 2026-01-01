package com.kh.hw.shape.model.vo;

public class Shape {
	private int type;
	private double height;
	private double withd;
	private String color = "white";
	
	public Shape() { 
		
	}
	//                            매개변수
	public Shape(int type, double height, double withd) {
		this.type = type;
		this.height = height;
		this.withd = withd;
	}
	
	public String information() {
		return type+", "+height+", "+withd;
	}
	public void setType(int type) {
		this.type = type;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
}
