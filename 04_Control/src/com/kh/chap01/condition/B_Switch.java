package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Switch {
	/*
	 *  동등비교
	 * Switch문과 if문의 차이점
	 * if(조건식) -> 조건식을 복잡하게 기술할 수 있음
	 * Switch는 조건식이 없으며, 확실한 값의 변수만 기술한다
	 * 
	 * [표현법]
	 * Switch (동등비교 수행 대상){
	 * case 값1 : 실행할 코드;
	 * 			  break	;
	 * case 값2 : 실행할 코드;
	 * 			  break;	
	 * ...
	 * default : 실행할 코드;
	 * }
	 * 
	 * 
	 * switch문의 장점
	 * - case를 통해 내가 실행하길 원하는 코드로 프리패스 하기 때문에 if~else문보다 훨씬 빠르다
	 * - 가독성!
	 * 
	 * switch문
	 * - 자주 사용되지는 않지만, 정밀한 연산결과가 "동일한 속도"로 수행되어야 하는 경우 사용한다
	 * - ex) 키보드 입력, 마우스 입력
	 */
	
	
	Scanner sc = new Scanner(System.in)
			;
	public void method1() {
		/* 
		 * 1~3 사이의 정수값을 입력 받아
		 * 1인 경우 빨간불
		 * 2인 경우 파란불
		 * 3인 경우 포록불
		 * 모두 아닌 경우, 잘못 입력했습니다 출력
		 */
		
		
		System.out.print("1~3 사이의 정수 입력 :");
		int num = sc.nextInt();
		
		if(num==1) {
			System.out.println("빨간불");
		} else if(num==2) {
			System.out.println("파란불");
		} else if(num==3) {
			System.out.println("초록불");
		} else {
			System.out.println("잘못 입력했습니다.");
		}
		
		
		switch(num) { //num : 비교대상자
		case 1 :
			System.out.println("빨간불");
			break;
		case 2 :
			System.out.println("파란불");
			break;
		case 3 :
			System.out.println("초록불");
			break;
		
		default : //else 역할
			System.out.println("잘못 입력했습니다.");
		}
		// 가독성, 성능
	}
	
	public void method2() {
		// 사용자에게 구매할 과일명을 입력 받아 각 과일 마다의 가격을 출력
		// 바나나(1000) 토마토(2000) 체리(3000)
		
		System.out.println("KH 과일가게");
		System.out.println("구매할 과일 (바나나, 토마토, 체리, 망고) :");
		
		//동일성비교
		String fruit = sc.next();
		int price = 0;
		
		switch(fruit) {
		case "바나나" :
			price = 1000;
			break;
		case "망고" : case "토마토" :
			price = 2000;
			break;
		case "체리" :
			price = 3000;
			break;
		}
			
			System.out.println(fruit+"의 가격은"+price+"원 입니다.");
		
	}
}
