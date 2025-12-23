package com.kh.chap01.condition;

import java.util.Scanner;

public class ControlPractice {
	Scanner sc = new Scanner(System.in);
			
	public void practice1() {
		System.out.print("1.입력");
		System.out.print("2.수정");
		System.out.print("3.조회");
		System.out.print("4.삭제");
		System.out.print("7.종료");
		System.out.print("메뉴 번호를 입력하세요. :");
		int num = sc.nextInt();
		
		if(num == 7) {
			System.out.println("프로그램 종료");
			return;
		}
		
		switch(num) {
		case 1 :
			System.out.print("입력");
			break;
		case 2 :
			System.out.print("수정");
			break;
		case 3 :
			System.out.print("조회");
			break;
		case 4 :
			System.out.print("삭제");
			break;
		case 7 :
			System.out.print("프로그램이 종료됩니다.");
			return;
					//메서드 내 어디든 사용가능
					//현재 위치에서 메서드를 "종료"시키는 키워드
			//break;
			
			default :
				System.out.println("잘못 입력했습니다.");
				return;
			}
		
			System.out.println("메뉴입니다.");
		
	}
	
	
	public void practice2() {
		System.out.print("숫자를 한 개 입력하세요.");
		int num = sc.nextInt();
		
		// 양수인지 아닌지
		//가드조건문
		//- 조건을 만족하지 않으면 즉시 종료하는 패턴
		if(!(num>0)) {
			System.out.println("양수만 입력하세요.");
			return;
		}
		// 홀수인지 짝수인지
		if(num%2==1) {
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}
		
		/*if(num>0 && num%2==0) {
			System.out.println("짝수다");
		} else if (num%2 !=0) {
			System.out.println("홀수다");
		} else if (num<0) {
			System.out.println("양수만 입력해주세요");
		}*/
		
	}
	
	
	public void practice3() {
		System.out.print("국어 점수 :");
		int A = sc.nextInt();
		System.out.print("수학 점수 :");
		int B = sc.nextInt();
		System.out.print("영어 점수 :");
		int C = sc.nextInt();
		
		int sum = A+B+C;
		double result = sum/3.0; //평균, 실수형
				
		if(!(A>=40 && B>=40 && C>=40 && sum>=60)) {
			System.out.println("불합격입니다.");
			return;
		}
		System.out.println("합계 :"+sum);
		System.out.println("평균 :"+result);
		System.out.println("축하합니다, 합격입니다!");
	}
	
	
	public void practice4() {
		System.out.print("1~12사이의 정수 입력 :");
		int num = sc.nextInt();
		
		String season="";
		
		switch(num) {
		case 1, 2, 12 :
			season = "겨울";
			break;
		case 3, 4, 5 :
			season = "봄";
			break;
		case 6, 7, 8 :
			season = "여름";
			break;
		case 9, 10, 11 :
			season = "가을";
			break;
			default :
				season = "잘못 입력된 달입니다..";
				return;
		}		
		System.out.println(num+"월은 "+season+"입니다.");
		
	}
	
	
	
	public void practice5() {
		String realId = "minmin";
		String realpwd = "imn";
				

		System.out.println("아이디 :");
		String id = sc.next();
		System.out.println("비밀번호 :");
		String pwd = sc.next();
		
		if(!id.equals(realId)){
			System.out.println("로그인 성공");
			return;
		}
		if(!pwd.equals(realpwd)) {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		
		System.out.println("로그인 성공");
	}
	
	
	
	public void practice6() {
		System.out.println("권한을 확인하고 하는 회원 등급 :");
		String user = sc.next();
		
		//break 없이
		switch(user) {
		case "관리자" :
			System.out.print("회원관리, 게시글관리, ");
		case "회원" :
			System.out.print("게시글작성, 댓글작성, ");
		case "비회원" :
			System.out.print("게시글조회");
			
		}
	}
	
	
	public void practice7() {
		System.out.print("키(m) :");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg) :");
		double kg = sc.nextDouble();
		
		double bmi = kg / (height * height);
		
		System.out.println("BMI 지수 :"+bmi);
		
		if(bmi<18.5) {
			System.out.println("저체중");
		} else if (bmi<23) {
			System.out.println("정상체중");
		} else if (bmi<25) {
			System.out.println("과체중");
		} else if (bmi<30) {
			System.out.println("비만");
		}else {
			System.out.println("고도 비만");
		}
		
	}
	
	
	public void practice8() {
		System.out.print("피연산자 1 :");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자 2 :");
		int num2 = sc.nextInt();
		
		System.out.print("연산자 입력 :");
		char ch = sc.next().charAt(0);
		
		if(!(num1>0 && num2 >0 && 
				(ch == '+' || ch == '-' || ch == '*' ||ch == '/' ||ch == '%' ))){
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}
		
		switch(ch) {
		case '+' :
			System.out.println(num1+ch+num2+"="+(num1+num2));
			break;
		case '-' :
			System.out.println(num1+ch+num2+"="+(num1-num2));
			break;
		case '*' :
			System.out.println(num1+ch+num2+"="+(num1*num2));
			break;
		case '/' :
			System.out.println(num1+ch+num2+"="+(num1/(double)num2));
			break;
		case '%' :
			System.out.println(num1+ch+num2+"="+(num1%num2));
			break;
		}
	}
	
	
	public void practice9() {
		System.out.print("중간 고사 점수 :");
		int midTest = sc.nextInt(); 
		
		System.out.print("기말 고사 점수 :");
		int finalTest = sc.nextInt(); 
		
		System.out.print("과제 점수 :");
		int report = sc.nextInt();
		
		System.out.print("출석 점수 :");
		int attend = sc.nextInt(); 
		
		double total = midTest * 0.2 + finalTest * 0.3 + report * 0.3 + attend;
		
		if(attend <= 14) {
			System.out.println("Fail [출석 회수 부족"+attend+"/20]");
			
			return;
		}
		
		System.out.println("총점 :"+total);
		if(total <70) {
			System.out.println("Fail");
		} else {
			System.out.println("PASS");
		}
	}
	
	
	public void practice10() {
		System.out.print("선택 :");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 9:
			practice3();
			break;
		}
	}
	
	
	public void practice11() {
		System.out.print("비밀번호 입력(1000~9999)");
		int pwd = sc.nextInt();
		
		if(!(pwd>=1000 && pwd<=9999)) {
			System.out.println("자리 수 안 맞음");
			return;
		} 
		
		int first = pwd / 1000; //1234/1000 = 1(.234)
		int second = pwd / 100 % 10; //1234/100 -> 12(.34) % 10 -> 2
		int third = pwd / 10 % 10; //1234/ 10 -> 123 % 10 -> charAt(2)
		int fourth = pwd % 10; //1234 % 10 -> 4
		
		if(first == second || first == third || first == fourth
				|| second == third || second == fourth || third == fourth) {
			System.out.println("중복값 있음");
		} else {
			System.out.println("생성 성공");
		}
	}
	
	
	
	
	}
