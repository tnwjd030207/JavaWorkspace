package com.kh.example.practice3.model.vo.Circle;

public class Run {
public static void main(String[] args) {
	Circle c = new Circle();
	
	// 초기값 출력
	c.getAreaOfCircle();
	c.getSizeOfCircle();
	
	// 반지름 1증가
	c.incrementRadius();
	
	// 증가된 값으로 다시 출력
	c.getAreaOfCircle();
	c.getSizeOfCircle();
}
}
