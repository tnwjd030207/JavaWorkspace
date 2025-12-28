package com.kh.operator;

import java.util.Scanner;

public class Test_2 {
	Scanner sc = new Scanner(System.in);
	//연산자 문제
	public void practice1() {
		System.out.print("인원 수 :");
		int people = sc.nextInt();
		
		System.out.print("사탕 개수 :");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 :"+(candy/people));
		System.out.println("남는 사탕 개수 :"+(candy%people));
		
	}
	public void practice2() {
		System.out.print("이름 :");
		String name = sc.next();
		
		System.out.print("학년 :");
		int num1 = sc.nextInt();
		
		System.out.print("반 :");
		int num2 = sc.nextInt();
		
		System.out.print("번호 :");
		int num3 = sc.nextInt();
		
		System.out.print("성별(M/F)");
		char gender = sc.next().charAt(0);
		String ox = gender == 'M' ? "남" : "여";
		
		System.out.print("성적 :");
		double result = sc.nextDouble();
		
		System.out.println(num1+"학년 "+num2+"반 "+num3+"번 "+name+" "+ox+"학생의 성적은 "+result+"이다.");
		
	}
	public void practice3() {
		System.out.println("나이 :");
		int age = sc.nextInt();
		
		
	}
}
