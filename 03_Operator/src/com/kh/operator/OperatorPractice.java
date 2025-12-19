package com.kh.operator;

import java.util.Scanner;

public class OperatorPractice {
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		
		
		System.out.print("인원 수:");
		int people = sc.nextInt();
		
		System.out.print("사탕 개수");
		int can = sc.nextInt();
		
		//int a = can/people;
		//int b = can%people;
		//System.out.print("1인당 사탕 개수 :"+a);
		//System.out.print("남는 사탕 개수 :"+b);
		
		System.out.print("1인당 사탕 개수 :"+(people/can));
		System.out.print("남는 사탕 개수 :"+(people%can));
	}
	
	public void practice2() {
		System.out.print("이름:");
		String name = sc.next();
		
		System.out.print("학년:");
		int a = sc.nextInt();
		
		System.out.print("반:");
		int b = sc.nextInt();
		
		System.out.print("번호:");
		int c = sc.nextInt();
		
		System.out.print("성별:");
		char gender = sc.next().charAt(0); //문법
		String result = gender == 'M' ? "남자" : "여자";
		// 조건문 ? 맞으면 a : 틀리면 b
		
		System.out.print("성적:");
		double d = sc.nextDouble();
		
		System.out.println(a+"학년"+b+"반"+c+"번"+name+gender+"의 성적은"+result+"이다.");
	}
	
	public void practice3() {
		System.out.print("나이:");
		int age = sc.nextInt();
		String result = age <= 13 ? "어린이" : 
			(age <= 19 ? "청소년" : "성인");
		
		System.out.println(result);
	}
	
	public void practice4() {
		System.out.print("국어:");
		int kor = sc.nextInt();
		
		System.out.print("영어:");
		int eng = sc.nextInt();
		
		System.out.print("수학:");
		int math = sc.nextInt();
		
		int sum = kor+eng+math;
		double avg = sum/3.0;
		
		System.out.println("합계 :"+sum);
		System.out.println("평균 :"+avg);
		
		System.out.println(
				kor >= 40 && eng >= 40 && math >= 40 
				&& avg >= 60.0 ? "합격" : "불합격"
				);
	}
	
	public void practice5() {
		System.out.print("주민등록번호 입력 (-포함) :");
		String str = sc.next();
		
		char gender = str.charAt(7);
		System.out.println(gender == '1' || gender == '3' ? "남자" : "여자");
	}
	
	public void practice6() {
		System.out.print("정수1 :");
		int num1 = sc.nextInt();
		System.out.print("정수2 :");
		int num2 = sc.nextInt();
		
		System.out.print("입력 :");
		int num3 = sc.nextInt();
		
		boolean result = (num2 < num3) || (num3 <= num1) ? true : false;
		System.out.print(result);
		
	}
	
	public void practice7() {
		System.out.print("입력1 :");
		int num1 = sc.nextInt();
		System.out.print("입력2 :");
		int num2 = sc.nextInt();
		System.out.print("입력3 :");
		int num3 = sc.nextInt();
		
	}
}
