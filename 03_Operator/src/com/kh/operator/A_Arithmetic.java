package com.kh.operator;

public class A_Arithmetic {
	
	//산술연산자
	// + / % + -
	public void method() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 ="+(num1+num2));//13
		//문자 뒤에 산술연산은 () 꼭 해주기
		System.out.println("num1 - num2 ="+(num1-num2));//7
		System.out.println("num1 * num2 ="+(num1*num2));//30
		System.out.println("num1 / num2 ="+(num1/num2));//3
		System.out.println("num1 % num2 ="+(num1%num2));//1
		//나누기 시에 0이 들어가지 않도록 주의, 에러
	}
}
