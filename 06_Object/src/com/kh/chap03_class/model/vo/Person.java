package com.kh.chap03_class.model.vo;

public class Person {
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gebder;
	private String phone;
	private String email;

	//기본 생성자
	
	//메서드부
	public void changeName (String name) {
		this.name = name;
	}
	public void printName() {
		System.out.println(this.name);
	}
}
