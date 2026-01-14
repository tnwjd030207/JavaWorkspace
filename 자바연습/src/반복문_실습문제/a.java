package 반복문_실습문제;

import java.util.Scanner;

public class a {
	Scanner sc = new Scanner(System.in);
	
	public void practice2() {
		System.out.println("1 이상의 숫자를 입력하세요 :");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			practice2();
		}
		for(int i=num; 1<=i; i--) {
			System.out.println(i+" ");
		}
		
	}
	
	public void practice3() {
		System.out.println("1 이상의 정수를 입력하세요 :");
		int num = sc.nextInt();
			
		int sum = 0;
		
		for(int i=1; i<num; i++ ) {
			System.out.print(i+"+");
			sum += i;
		}
		System.out.println(num+"="+(num+sum));
	} 
	
	public void practice4() {
		
	}
}
