package 반복문_실습문제;

import java.util.Scanner;

class 반복문 {
	Scanner sc = new Scanner(System.in);
	public void practice1(){
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		for(int i=1; num>=i; i++) {
			System.out.println(i);
		}
	}
	
	public void practice2() {
		System.out.println("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		for(int i=num; 1<=i; i--) {
			System.out.println(i);
		}
		
	}
	
	public void practice3() {
		//1 이상을 입력 받기
		//입력 받은 수까지 반복
		//반복한 수를 합하고 출력
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i=1; i<num; i++) {
			System.out.print(i+"+");
			sum += i;
		}
		System.out.print(num+"="+(sum+num));
	}
	
	public void practice4() {
		//사용자로부터 두 개의 값을 입력 받기
		//1 미만의 숫자가 입력됐다면 다시 입력하도록 하기
		//그 사이 숫자 출력
		//	두 개의 숫자 중에서 더 낮은 수부터 큰 수까지 출력
		
		System.out.print("첫 번째 숫자 :");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 :");
		int num2 = sc.nextInt();
		
		if(num1<1 && num2<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice4();
		}
		if(num1>num2) {
			for(int i=num2; i<=num1; i++) {
				System.out.println(i);
			}
		}else if(num1<num2) {
			for(int i=num1; i<=num2; i++) {
				System.out.println(i);
			}
			
		}
	}
	
	public void practice5() {
		//사용자로부터 입력 받은 숫자의 단부터 9단까지 출력
		//9를 초과X 다시 입력
		
		System.out.print("숫자 :");
		int num = sc.nextInt();
		
		if(num>9) {
			System.out.println("9 이하의 숫자를 입력해주세요");
			practice5();
		}
		
		for(int i=num; i<=9; i++) {
			System.out.println("====="+i+"단 =====");
		}
	}
	
	public void practice6() {
		//시작 숫자와 공차 입력 받기
		//일정한 값으로 숫자가 커지거나 작아지는
		//출력되는 숫자는 총 10개
		
		System.out.print("시작 숫자 :");
		int num = sc.nextInt();
		System.out.print("공차 :");
		int go = sc.nextInt();
		
		for(int i=num; i<10; i++) {
			System.out.print((i*go+" "));
		}
		
	}
}
