package com.kh.hw.person.model.vo;

public class Person {
	private String name;
	private int age;
	private double height;
	private  double weiht;
	
	public Person(){
		
	}
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weiht = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeiht() {
		return weiht;
	}
	public void setWeiht(double weiht) {
		this.weiht = weiht;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", weiht=" + weiht + "]";
	}

	
}
