package com.kh.chap04.field.model.vo;

public class FieldTest2 {
	/*
	 * 접근제한자
	 * (+) public -> 어떤 패키지의 어떤 클래스에서든 접근 가능하도록 설정
	 * (#) protected -> 같은 페이지 내에서만 사용하도록 설정
	 * 					단,다른 패키지인 경우 상속받은 클래스에서만 추가로 접근 가능
	 * (~) defult -> 같은 패키지 내에서만 접근 가능하도록 설정
	 * 				 접근제한지를 사용하지 않는 경우 기본값	
	 * (-) privata -> 같은 클래스만 접근 가능하도혹 설정 ㅎ
	 */
	public String pub = "public";
	protected String pro = "protected"; 
	String def = "defult";
	private String pri = "private";

}

