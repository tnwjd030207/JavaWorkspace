package com.kh.example.practice2.model.vo;

public class Circle {
	//private
	public static final double PI = 3.14;
	public static int radius = 1;
	
	public void Circle() {
		
	}
	
	public void incrementRadius() { //호출할 때 마다 1증가
		this.radius = this.radius + 1;
	}
	
	public void getAreaOfCircle() { //둘레
		System.out.println(this.PI * this.radius *2); 
	}
	public void getRa() {
		System.out.println(this.radius); 
	}
	public void getSizeOfCircle() {
		System.out.println(this.radius * this.radius * this.PI); //넓이
	}

}
