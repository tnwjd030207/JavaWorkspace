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

	public void rps() {
		// 사용자의 이름을 입력하고 컴퓨터와 가위바위보
		// 컴퓨터는 랜덤수를 통해 결정, 사용자에겐 직접 받기
		// “exit”가 들어가면 종료, 결과 출력

		System.out.print("당신의 이름을 입력해주세요 :");
		String name = sc.next();
		sc.nextLine(); //개행문자
		
		int count = 0;
		int lose=0, drow=0, win=0; 

		
		while(true) {
		System.out.print("가위바위보 :");
		String me = sc.nextLine();

		if (!(me.equals("가위") || me.equals("바위") || me.equals("보"))) {
			System.out.println("잘못 입력했습니다");
		}

		int com = (int) (Math.random() * 2);
		String comStr = "";
		if (com == 0) {
			comStr = "가위";
		} else if (com == 1) {
			comStr = "바위";
		} else if (com == 2) {
			comStr = "보";
		}
		System.out.println("컴퓨터 :" + comStr);

		if (me.equals(comStr)) {
			System.out.println("비겼습니다");
			count++;
			drow++;

		} else if ((me.equals("가위") && comStr.equals("보")) || (me.equals("바위") && comStr.equals("가위"))
				|| (me.equals("보") && comStr.equals("바위"))) {
			System.out.println("이겼습니다!");
			count++;
			win++;

		} else if ((me.equals("가위") && comStr.equals("바위")) || (me.equals("바위") && comStr.equals("보"))
				|| (me.equals("보") && comStr.equals("가위"))) {
			System.out.println("졌습니다 ㅠㅠ");
			count++;
			lose++;
		}

		if (me.equals("exit")) {
			System.out.println(count + "전 " + win + "승 " + drow + "무 " + lose + "패");
			break;
		}
		}

	}
}
