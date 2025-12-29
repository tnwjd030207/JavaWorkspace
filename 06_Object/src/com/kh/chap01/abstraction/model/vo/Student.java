package com.kh.chap01.abstraction.model.vo;
	//클래스 아래에 있는 변수 : 필드
	//추상화 사용
public class Student {
	//학생 관리 프로그램을 만든다고 가정
	//학생과 관련된 속성 : 이름, 번호, 전화번호, 성별, 학과, 나이 ...
	// 인적사항 ( 이름, 나이, 키 3가지 정보만 관리)
	public String name;
	public int age;
	public double height;
	
	
	// 학생 객체가 가지는 기능
	public void study() {
		System.out.println("공부중...");
	}
	
}
