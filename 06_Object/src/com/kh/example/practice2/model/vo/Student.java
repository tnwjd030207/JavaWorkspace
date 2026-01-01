package com.kh.example.practice2.model.vo;

public class Student {
	private static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	//static 초기화 , 한 번만 실행
	static {
		grade = 1;
	}
	 public void student() {
		this.classroom = 2;
		this.name = "류수정";
		this.height = 12.3;
		this.gender = 'w';
	 }
	
	public void information() {
		System.out.println(grade+classroom+name+height+gender);
	}
}
