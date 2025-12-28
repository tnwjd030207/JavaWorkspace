package com.kh.practice1.func;

import java.util.Scanner;

public class Test_1 {
	Scanner sc = new Scanner(System.in);
	//변수 실습 문제
	public void practice1() {
		System.out.print("이름을 입력하세요 :");
		String name = sc.next();
		
		System.out.print("성별을 입력하세요(남/여) :");
		char gender = sc.next().charAt(0);
		
		System.out.print("나이를 입력하세요 :");
		int age = sc.nextInt();
		
		System.out.print("키를 입력하세요(cm) :");
		double height = sc.nextDouble();
		
		System.out.println("키 "+height+"인 "+age+"살 "+gender+"자 "+name+"님 "+"반갑습니다. ^^");
		
	}
	
	public void practice2() {
		System.out.print("첫 번째 정수 :");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 :");
		int num2 = sc.nextInt();
		
		int plus = num1+num2;
		int min = num1-num2;
		int mul = num1*num2;
		int div = num1/num2;
		
		System.out.println("더하기 결과 :"+plus);
		System.out.println("빼기 결과 :"+min);
		System.out.println("곱하기 결과 :"+mul);
		System.out.println("나누기 결과 :"+div);
	}
	
	public void practice3() {
		System.out.print("가로 :");
		double width = sc.nextDouble();
		
		System.out.print("세로 :");
		double height = sc.nextDouble();
		
		double area = width*height;
		double cir = (width+height)*2;
		
		System.out.println("면적 :"+area);
		System.out.println("둘레 :"+cir);
	}
	
	public void practice4() {
		System.out.println("문자열을 입력하세요 :");
		String word = sc.next();
		
		System.out.println("첫 번째 문자 :"+word.charAt(0));
		System.out.println("두 번째 문자 :"+word.charAt(1));
		System.out.println("세 번째 문자 :"+word.charAt(2));
	}
	//형변환 실습 문제
	public void practice5() {
		System.out.print("국어 :");
		double a = sc.nextDouble();
		
		System.out.print("영어 :");
		double b = sc.nextDouble();
		
		System.out.print("수학 :");
		double c = sc.nextDouble();
		
		int sum = (int)(a+b+c);
		int total = sum/3;
		
		System.out.println("총점 :"+sum);
		System.out.println("평균 :"+total);
		
	}
	
	public void practice6() {
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A';
		
		System.out.println( iNum1 / iNum2 ); // 2
		System.out.println( (int)dNum ); // 2
		System.out.println(  ); // 10.0
		System.out.println( (double)iNum1 ); // 10.0
		System.out.println( dNum ); // 2.5
		System.out.println(  ); // 2.5
		System.out.println( (int)fNum ); // 3
		System.out.println( ); // 3
		System.out.println( );// 3.3333333
		System.out.println( ); // 3.3333333333333335
		System.out.println( ch ); // 'A'
		System.out.println( ch ); // 65
		System.out.println(  ); // 75
		System.out.println( ); // 'K'
	}
}
