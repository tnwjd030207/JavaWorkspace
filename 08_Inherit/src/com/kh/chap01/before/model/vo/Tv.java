package com.kh.chap01.before.model.vo;

import com.kh.chap01.after.model.vo.Product;

public class Tv extends Product {
	private int inch;
	
	public Tv() {
		
	}
	
	public Tv(String brand, String pCode, String pName, int price, int inch) {
		super(brand, pCode, pName, price);
		this.inch = inch;
	}
}
