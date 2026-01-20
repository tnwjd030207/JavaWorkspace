package com.kh.example.practice3.model.vo.Circle;

public class Circle {	
 private static final double PI = 3.14;
 private int radius = 1;
 
 public Circle() { 
 }
 
 //반지름을 1증가시키기 
 public void incrementRadius() {
	 radius++;
 }
 
 //원의 넓이 계산 (공식 : PI * 반지름 * 반지름))
 public void getAreaOfCircle() {
	 double area = PI * radius * radius;
	 System.out.println("원의 넓이 :"+area);
 }
 //원의 둘레 (공식: 2 * PI * 반지름)
 public void getSizeOfCircle() {
	 double size = 2 * PI * radius;
	 System.out.println("원의 둘레 :"+size);
 
	}
}

