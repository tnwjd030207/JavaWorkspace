package 연산자_실습문제;

import java.util.Scanner;

public class 연산자 {
	Scanner sc = new Scanner(System.in);
	public void method1() {
		System.out.print("인원 수 :");
		int people = sc.nextInt();
		System.out.print("사탕 개수 :");
		int candy = sc.nextInt();
		
		int a = candy/people;
		int b = candy%people;
		
		System.out.println("1인당 사탕 개수 :"+a);
		System.out.println("남는 사탕 개수 :"+b);
		
	}
	
	public void method2() {
		System.out.println("키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요");
		System.out.println("이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요");
		
		System.out.print("이름 :");
		String name = sc.next();
		
		System.out.print("학년(숫자만) :");
		int a = sc.nextInt();
		
		System.out.print("반(숫자만) :");
		int b = sc.nextInt();
		
		System.out.print("번호(숫자만) :");
		int num = sc.nextInt();
		
		System.out.print("성별(M/F)");
		char gender = sc.next().charAt(0);
		
		System.out.print("성적(소수점 아래 둘째자리까지) :");
		double grade = sc.nextDouble();
		
		System.out.println(a+"학년 "+b+"반 "+num+"번 "+name+" "+gender+"학생의 성적은 "+grade+"이다.");
	}
	
	public void method3() {
		System.out.print("나이 :");
		int age = sc.nextInt();
		
		if(age<=13) {
			System.out.println("어린이");
		}else if(age<=19) {
			System.out.println("청소년");
		}else {
			System.out.println("성인");
		}
		
	}
	
	public void method4() {
		System.out.print("국어 :");
		int kor = sc.nextInt();
		
		System.out.print("영어 :");
		int eng = sc.nextInt();
		
		System.out.print("수학 :");
		int math = sc.nextInt();
		
		System.out.print("합계 :"+(kor+eng+math));
		System.out.print("평균 :"+((double)((kor+eng+math)/3)));
	}
	
	public void method5() {
		System.out.println("주민번호를 입력하세요 (- 포함)");
		String person = sc.nextLine();
		
		if(person.charAt(7) == '2' || person.charAt(7) == '4') {
			System.out.println("여자");
		}else if(person.charAt(7) == '1' || person.charAt(7) == '3'){
			System.out.println("남자");
		}
		
	}
	
	public void method6() {
		System.out.print("정수1 :");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 :");
		int num2 = sc.nextInt();
		
		System.out.print("입력 :");
		int number = sc.nextInt(); 
		
		if(number<=num1 && number>num2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	public void method7() {
		System.out.print("입력 1 :");
		int num1 = sc.nextInt();
		
		System.out.print("입력 2 :");
		int num2 = sc.nextInt();
		
		System.out.print("입력 3 :");
		int num3 = sc.nextInt();
		
		if(num1 == num2 && num2 == num3 && num1 == num3) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	public void method8() {
		System.out.print("A사원의 연봉 :");
		int a = sc.nextInt();
		
		System.out.print("B사원의 연봉 :");
		int b = sc.nextInt();
		
		System.out.print("C사원의 연봉 :");
		int c = sc.nextInt();
		
		double a1 = a*0.4;
		double c1 = b*0.15;
		
		if((a+a1)>=3000) {
			System.out.println("A사원 연봉/연봉+a : 3000 이상");
		} else {
			System.out.println("A사원 연봉/연봉+a : 3000 미만");
		}
		
		if(b>=3000) {
			System.out.println("B사원 연봉/연봉+a : 3000 이상");
		}else {
			System.out.println("B사원 연봉/연봉+a : 3000 미만");
		}
		
		if((c+c1)>=3000) {
			System.out.println("C사원 연봉/연봉+a : 3000 이상");
		}else {
			System.out.println("C사원 연봉/연봉+a : 3000 미만");
		}
		
		
		
	}
}
