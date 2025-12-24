package com.kh.chap02.loop;

import java.util.Scanner;

public class test {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.print("숫자 입력 :");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력하세요.");
			practice1();
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		}

	}

	public void practice2() {
		System.out.print("숫자 입력 :");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.print("1 이상의 숫자를 입력하세요.");
			practice2();
		} else {
			for (int i = num; i > 0; i--) {
				System.out.print(i + " ");
			}
		}

	}

	public void practice3() {
		System.out.print("정수를 하나 입력하세요 :");
		int num = sc.nextInt();

		int sum = 0;

		if (num < 0) {
			practice3();
		} else {
			for (int i = 1; i <= num; i++) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	//
	public void practice4() {
		System.out.print("첫 번째 숫자");
		//num1 = 사용자한테 값을 받는 것
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자");
		int num2 = sc.nextInt();

		//num1 num 1미만일 때 
		if (num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			//자기 자신을 호출
			practice4();
			//함수를 끝내겠다
			return;
		}
		//num1이 num2보다 클 때 실행되는 if문
		if (num1 > num2) {
			//num2부터 num1까지 반복, 1씩 증가
			for (int i = num2; i <= num1; i++) {
				System.out.print(i + " ");
			}
		} else {
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		}

	}

	//
	public void practice5() {
		System.out.print("숫자 :");
		int num = sc.nextInt();

		if (num > 9) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
			practice5();
			return;
		}

		for (int i = 1; i < num; i++) {

		}
	}
}
