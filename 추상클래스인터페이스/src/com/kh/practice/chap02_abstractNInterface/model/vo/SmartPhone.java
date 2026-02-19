package com.kh.practice.chap02_abstractNInterface.model.vo;

public interface SmartPhone implements Cellphone, TochDisplay {
	private String maker;
	
	public void SmartPhone();
	public String printInformation();

	void setMake(String maker);
	String getMaker();
}
