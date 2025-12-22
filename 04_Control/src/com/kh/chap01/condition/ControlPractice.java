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
		
		if(user.equals("관리자")) {
			System.out.println("회원관리, 게시글 관리. 게시글 작성, 게시글 조회, 댓글 작성");
		} else if (user.equals("회원")) {
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		} else if (user.equals("비회원")){
			System.out.println("게시글 조회");
		} else {
			System.out.println("다시");
		}
	}
	
	
	public void practice7() {
		System.out.print("키 :");
		double A = sc.nextDouble();
		
		System.out.print("몸무게 :");
		double B = sc.nextDouble();
		
		double bmi = B/A*A;
		
		if(bmi<18.5) {
			System.out.println("저체중");
		} else if (bmi<23) {
			System.out.println("정상체중");
		} 
	
	
	
	
	
	
	
	
	}
