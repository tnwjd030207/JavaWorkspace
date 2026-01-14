package 반복문_실습문제;

import java.util.Scanner;

class 반복문 {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		for (int i = 1; num >= i; i++) {
			System.out.println(i);
		}
	}

	public void practice2() {
		System.out.println("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		for (int i = num; 1 <= i; i--) {
			System.out.println(i);
		}

	}

	public void practice3() {
		// 1 이상을 입력 받기
		// 입력 받은 수까지 반복
		// 반복한 수를 합하고 출력

		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;
		for (int i = 1; i < num; i++) {
			System.out.print(i + "+");
			sum += i;
		}
		System.out.print(num + "=" + (sum + num));
	}

	public void practice4() {
		// 사용자로부터 두 개의 값을 입력 받기
		// 1 미만의 숫자가 입력됐다면 다시 입력하도록 하기
		// 그 사이 숫자 출력
		// 두 개의 숫자 중에서 더 낮은 수부터 큰 수까지 출력

		System.out.print("첫 번째 숫자 :");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 :");
		int num2 = sc.nextInt();

		if (num1 < 1 && num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			practice4();
		}
		if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				System.out.println(i);
			}
		} else if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				System.out.println(i);
			}

		}
	}

	public void practice5() {
		// 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력
		// 9를 초과X 다시 입력

		System.out.print("숫자 :");
		int num = sc.nextInt();

		if (num > 9) {
			System.out.println("9 이하의 숫자를 입력해주세요");
			practice5();
		}

		for (int i = num; i <= 9; i++) {
			System.out.println("=====" + i + "단 =====");
		}
	}

	public void practice6() {
		// 시작 숫자와 공차 입력 받기
		// 일정한 값으로 숫자가 커지거나 작아지는
		// 출력되는 숫자는 총 10개

		System.out.print("시작 숫자 :");
		int num = sc.nextInt();
		System.out.print("공차 :");
		int go = sc.nextInt();

		for (int i = 0; i < 10; i++) {
			System.out.print((num + (go * i) + " "));
		}

	}

	public void practice7() {
		// 정수 2개와 연산자를 입력 받기
		// 연산자 입력에 exit 값이 들어올 때까지 무한 반복
		// 연산자가 나누기일 때 2번째 정수 0이면 다시 입력
		// 없는 연산자가 들어올 시 다시 입력
		while (true) {
			System.out.print("연산자 (+, -, *, /, %) :");
			String x = sc.next();
			System.out.print("정수1 :");
			int num1 = sc.nextInt();
			System.out.print("정수2 :");
			int num2 = sc.nextInt();

			if ("exit".equals(x)) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if ("/".equals(x)) {
				if (num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
					continue;
				}
			}

			switch (x) {
			case "+":
				System.out.println(num1 + num2);
				break;
			case "-":
				System.out.println(num1 - num2);
				break;
			case "*":
				System.out.println(num1 * num2);
				break;
			case "/":
				System.out.println(num1 / num2);
				break;
			case "%":
				System.out.println(num1 % num2);
				break;
			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				continue;
			}

		}

	}

	// i행 j열
	public void practice8() {
		System.out.print("정수 입력 :");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice9() {
		System.out.print("정수 입력 :");
		int num = sc.nextInt();
		// 층
		for (int i = 0; i < num; i++) {
			// 호수
			for (int j = num; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice12() {
		System.out.print("자연수 하나를 입력하세요 :");
		int num = sc.nextInt();
		int count = 0;
		//i랑 하나하나 비교
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.print(i+" ");
			}
			if (i % 2 == 0 && i % 3 == 0) {
				count++;
			}

		}
		System.out.print("count :" + count);
		
	}
}
