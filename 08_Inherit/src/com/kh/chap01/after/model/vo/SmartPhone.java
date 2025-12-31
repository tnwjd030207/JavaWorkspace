package com.kh.chap01.after.model.vo;

public class SmartPhone extends Product{
	private String mobileAgency;
	
	public SmartPhone() {
		
	}
	
	public SmartPhone(String brand, String pCode, String pName, int price, String  mobileAgency) {
		super(brand,pCode,pName,price);

	}

	public String getMobileAgency() {
		return mobileAgency;
	}
	
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	// 부모 클래스(super class)에 존재하는 필드나 메서드를 자식 클래스(sub class)에서 재정의하여 사용하는 것
	@Override 
	public String information() {
		return super.information()+","+mobileAgency;
	}
}
