package 반복문_실습문제;

import java.util.Scanner;

public class a {
	Scanner sc = new Scanner(System.in);
	 public void practice4(){
		 //두 개 값을 입력 받아 그 사이의 숫자를 모두 출력
		 //1미만의 숫자를 입력하면 다시 입력
		 
		 System.out.print("정수 1 :");
		 int num1 = sc.nextInt();
		 System.out.print("정수 2 :");
		 int num2 = sc.nextInt();
		 
		 if(num1<1 || num2<1) {
			 System.out.println("1 이상의 숫자를 입력해주세요");
			 practice4();
		 }
		 
		 if(num1>num2) {
			 for(int i=num2; i<=num1; i++) {
				 System.out.println(i+" ");
			 }
		 }else if(num1<num2) {
			 for(int i=num1; i<=num2; i++) {
				 System.out.println(i+" ");
			 }
		 }
		 
		 
		 
	 }
	 
	 public void practice5(){
		 //사용자로부터 숫자 입력 받기 
		 //입력 받은 단부터 9단까지 출력
		 //9단을 초과한 수를 입력했다면 다시 값을 입력
		 
		 System.out.println("숫자 :");
		 int num = sc.nextInt();
		 
		 if(num>9) {
			 System.out.println("9 이하의 숫자를 입력해주세요");
			 practice5();
		 }
		 
		 for(int i=num; i<=9; i++) {
			 System.out.println("===== "+i+"단 =====");
		 }
	 }
	 
	 public void practice6(){
		 //사용자로부터 시작 숫자와 공차 입력 받기
		 //일정한 값으로 숫자가 커지거나 작아지는 거 구현
		 //출력되는 숫자는 총 10개
		 System.out.println("시작 숫자 :");
		 int num = sc.nextInt();
		 System.out.println("공차 :");
		 int g = sc.nextInt();
		 
		 for(int i=0; i<10; i++) {
			 System.out.println(num+(g*i));
		 }
	 }
}
