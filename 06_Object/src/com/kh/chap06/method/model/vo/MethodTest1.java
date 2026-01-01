package com.kh.chap06.method.model.vo;

public class MethodTest1 {
	/*
	 * [표현법] 접근제한자 예약어 자료형 메서드명 ([매개변수]){ 수행할 코드
	 * 
	 * return 반환할 값 (생략가능) }
	 * 
	 * void -> 반환할 값X
	 */

	// 1. 매개변수가 없고, 반환할 값도 없는 메서드
	public void method1() {
		System.out.println("매개변수X, 반환값X");
		
		// return;
	}

	
	// void는 알아서 넣어줌

	// 2.매개변수X, 반환형O
	public int method2() {
		System.out.println("매개변수X, 반환값O");
		int random = (int) (Math.random() * 100 + 1);

		return random;
	}

	// 3. 매개변수O, 반환형X
	public void method3(int x, int y) {
		int min = 0;
		int max = 0;

		if (x > y) {
			min = y;
			max = x;
		} else {
			min = x;
			max = y;
		}
		System.out.println("최소값 :" + min + ", 최대값 :" + max);

	}

	// 4. 매개변수O, 반환형O
	public int multiply(int a, int b) {
		return a + b;
	}
}
