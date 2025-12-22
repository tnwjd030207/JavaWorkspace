package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	Scanner sc = new Scanner(System.in);

	public void method1() {
	/*조건문	
	 * 조건식을 통해 팜/거짓을 판단하여 그에 해당하는 코드를 실행
	 * 조건식은 보통 비교 연산자, 논리 연산자를 사용하여 작성
	 * 조건문은 if / switch 문으로 나뉨
	 * 
	단독 If문
	* if(조건식){
	* 조건식이 true인 경우 실행할 코드
	* }
	*/
		
		
	System.out.print("정수를 입력하세요 : ");
	int num = sc.nextInt();

	if(num>0) {
		System.out.println("양수다");
	
	if(num<=0) {
			System.out.println("양수가 아니다");
			   }
	}
	
	}

	public void method2() {
		/*
		 * if~else문 if(조건식){ 조건식이 true인 경우 실행할 코드 } else { 조건식이 false인 경우 실행할 코드 }
		 */

		System.out.print("정수를 입력하세요 :");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("양수다");
		} else {
			System.out.println("양수 아니다");
		}
		// 실행할 코드 한줄일 경우 {} 없어도 됨

	}

	public void method3() {
		/*
		 * if ~ else if문 - 같은 비교대상으로 "여러개의 조건"을 제시해야 하는 경우 사용 if(조건식1){ 조건식1이 true인 경우
		 * 실행할 코드 } else if(조건식2) { 조건식3가 true인 경우 실행할 코드 } else if(조건시구) { 조건식n이 true인
		 * 경우 실행할 코드 } else { 위 조건들이 모두 false인 경우 실행할 코드 }
		 */

		System.out.print("정수 :");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("양수다");
		} else if (num == 0) {
			System.out.println("0이다");
		} else {
			System.out.println("음수다");
		}

	}

	public void method4() {
		// 사용자가 입력한 나이를 가지고 어린이/청소년/성인/어르신 인지 출력
		// 어린이(13세 이하), 청소년(13세 초과. 19세 이하),
		// 성인(19세 초과. 60세 이하), 어르신(60세 초과)
		
		System.out.print("나이 입력 :");
		int age = sc.nextInt();

		if (age <= 13) {
			System.out.println("어린이");
		} else if (age <= 19) {
			System.out.println("청소년");
		} else if (age <= 60) {
			System.out.println("성인");
		} else {
			System.out.println("어르신");
		}
		
	}
	
	public void method5() {
		//성별과 이름을 입력받아, 이름과 성별을 출력
		//성별은 m/f로 입력받고 출력시에는 남자, 여자로 출력
		
		System.out.print("이름 :");
		String name = sc.next();
		
		System.out.print("성별 :");
		char ch = sc.next().charAt(0);
		
		String result = ""; //변수 선언. 초기화
		if(ch=='m' || ch=='M') {
			result = "남자";
		} else if(ch=='f' || ch=='F') {
			result = "여자";
		} else {
			result = "중성";
		}
		
		/*String result = "여자"
		if(ch=='m' || ch=='M') {
			result = "남자";*/
			
		System.out.println(name+"님은"+result+"입니다");
	}
	
	public void method6() {
		//사용자에게 이름을 입력받아 본인 이름과 일치하는지 비교하기
		
		String name = sc.next();
		
		//안됨
		if(name == "류수정") {
			System.out.println("류수정님 반갑습니다");
		} else {
			System.out.println("누구세요?");
		}
		
		/*
		 * 기본자료형 : boolean, char, byte, short, int, long, float, double
		 * 참조자료형 : String
		 * 
		 * - 기본자료형간 비교시 ==, !=는 사용 가능.
		 * - 단, 참조자료형은 동등비교시 정상적인 비교가 안된다.
		 * - 참조자료형은 서로 값이 동일한지 비교할 때, equals()를 사용.
		 * 
		 */
		
		if(name.equals("류수정")) {
			System.out.println("류수정님 반갑습니다");
		} else {
			System.out.println("누구세요?");
		}
	}

}


