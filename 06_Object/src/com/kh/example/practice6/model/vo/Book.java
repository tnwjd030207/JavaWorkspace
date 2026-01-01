package com.kh.example.practice6.model.vo;

public class Book {
	private String title; 
	private String publisher ;
	private String author ;
 	private int price ;
	private double disountRate;
	/*
	 * 1. 초기화
	 * 2. setter
	 * 3. 생성자
	 * 4. JVM의 의한 자동 초기화
	 * 5.
	 */
	
	public Book() {
		
	}
	
	public Book(String title, String publisher, String author) {
		
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		
	}
	public Book(String title, String publisher, 
			String author, int price, double disountRate) {
		
		this(title,publisher,author); //코드 줄이기
		this.price = price;
		this.disountRate = disountRate;
		
	}
	
	public void inform() {
		System.out.println(title+publisher+author+price+disountRate);
	}
}
