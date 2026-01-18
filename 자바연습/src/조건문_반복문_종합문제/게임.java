package 조건문_반복문_종합문제;

import java.util.Scanner;

public class 게임 {
	Scanner sc = new Scanner(System.in);

	public void upDown() {
		// 1~100 사이의 정수 중 임의의 난수가 정해짐
		// 사용자는 정해진 난수를 맞추고 몇 번 만에 맞췄는지 출력

		int random = (int) (Math.random() * 100) + 1; // 난수
		int count = 0; // 시도 횟수

		while (true) {
			System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 :");
			int num = sc.nextInt();

			if (num < 1 || num > 100) {
				System.out.println("1~100 사이의 숫자를 입력해주세요");
				continue;
			}
			if (random > num) {
				System.out.println("up!");
				count++;
				continue;
			} else if (random < num) {
				System.out.println("down!");
				count++;
				continue;
				
			}
			if (random == num) {
				System.out.println("정답입니다! " + count + "회만에 맞추셨습니다.");
			}
		}

	}
	
	public void rps(){
		
	}
}
