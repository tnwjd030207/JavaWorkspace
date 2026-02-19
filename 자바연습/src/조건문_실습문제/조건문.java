package 조건문_실습문제;

import java.util.Scanner;

public class 조건문 {
	Scanner sc = new Scanner(System.in);

	public void method1() {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");

		System.out.print("메뉴 번호를 입력하세요 :");
		int num = sc.nextInt();

		if (num == 1) {
			System.out.println("입력 메뉴입니다.");
		} else if (num == 2) {
			System.out.println("수정 메뉴입니다.");
		} else if (num == 3) {
			System.out.println("조회 메뉴입니다.");
		} else if (num == 4) {
			System.out.println("삭제 메뉴입니다.");
		} else if (num == 7) {
			System.out.println("프로그램이 종료됩니다.");
		}

	}

	public void method2() {
		System.out.print("숫자를 한 개 입력하세요 :");
		int num = sc.nextInt();

		if (num < 0) {
			System.out.println("홀수");
			System.out.println("양수만 입력해주세요.");
		} else {
			System.out.println("짝수");
		}

	}

	public void method3() {
		System.out.print("국어 점수 :");
		int kor = sc.nextInt();
		System.out.print("수학 점수 :");
		int math = sc.nextInt();
		System.out.print("영어 점수 :");
		int eng = sc.nextInt();

		int sum = kor + math + eng;
		double ave = (kor + math + eng) / 3;

		if (sum >= 40 && ave >= 60) {
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + ave);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불학격입니다.");
		}
	}

	public void method4() {
		System.out.print("1~12 사이의 정수 입력 :");
		int num = sc.nextInt();

		switch (num) {
		case 12, 1, 2:
			System.out.println(num + "월은 겨울입니다.");
			break;
		case 3, 4, 5:
			System.out.println(num + "월은 봄입니다.");
			break;
		case 6, 7, 8:
			System.out.println(num + "월은 여름입니다.");
			break;
		case 9, 10, 11:
			System.out.println(num + "월은 가을입니다.");
			break;

		default:
			System.out.println(num + "월은 잘못 입력된 달입니다.");
			break;
		}
	}

	public void method5() {
		String id1 = "minmin";
		String pw1 = "min123";

		System.out.println("아이디 :");
		String id2 = sc.next();
		System.out.println("비밀번호 :");
		String pw2 = sc.next();

		if (id1.equals(id2) && pw1.equals(pw2)) {
			System.out.println("로그인 성공");
		} else if (!(id1.equals(id2))) {
			System.out.println("아이디가 틀렸습니다.");
		} else if (!(pw1.equals(pw2))) {
			System.out.println("비밀번호가 틀렸습니다.");
		}
	}

	public void method6() {
		System.out.print("권한을 확인하고자 하는 회원 등급 :");
		String people = sc.next();

		switch (people) {
		case "관리자":
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "회원":
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "비회원":
			System.out.println("게시글 조회");
			break;
		}
	}

	public void method7() {
		System.out.print("키(m)를 입력해 주세요. :");
		double cm = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요. :");
		double kg = sc.nextDouble();

		double bmi = kg / (cm * cm);

		if (bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi < 23) {
			System.out.println("정상체중");
		} else if (bmi < 25) {
			System.out.println("과체중");
		} else if (bmi < 30) {
			System.out.println("비만");
		}
	}

	public void method8() {
		System.out.print("피연산자1 입력 :");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 :");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력 (+, -, *, /, %) :");
		char ch = sc.next().charAt(0);

		if (num1 > 0 && num2 > 0) {
			if (ch == '+') {
				System.out.println(num1 + num2);
			} else if (ch == '-') {
				System.out.println(num1 - num2);
			} else if (ch == '/') {
				System.out.println((double) num1 / num2);
			} else if (ch == '%') {
				System.out.println((double) num1 % num2);
			} else {
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				return;
			}
		} else {
			System.out.println("양수만 입력해주세요.");
		}

	}

	public void method9() {
		System.out.print("중간 고사 점수 :");
		int a = sc.nextInt();
		System.out.print("기말 고사 점수 :");
		int b = sc.nextInt();
		System.out.print("과제 점수 :");
		int test = sc.nextInt();
		System.out.print("출석 회수(20회) :");
		int student = sc.nextInt();

		double a1 = a * 0.2;
		double b1 = b * 0.3;
		double test2 = test * 0.3;

		double sum = a1 + b1 + test2 + student;

		System.out.println("============ 결과 ============");
		if (20 - student >= (20 * 0.3)) {
			System.out.println("Fail [출석 횟수 부족 (" + student + "/20)]");
		} else if (sum >= 70) {
			System.out.print("중간 고사 점수(20) :" + a1);
			System.out.print("기말 고사 점수(30) :" + b1);
			System.out.print("과제 점수 (30) :" + test2);
			System.out.print("출석 점수 (20) :" + student);
			System.out.print("총점 :" + sum);
			System.out.println("PASS");
		} else if (sum < 70) {
			System.out.println("Fail");
		}

	}

	public void method10() {
		System.out.println("실행할 기능을 선택하세요.");
		
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		
		System.out.print("선택 :");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			method4();
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			break;
		}
	}

	public void method11() {
		System.out.print("비밀번호 입력(1000~9999) :");
		String pw = sc.next();
		
		char ch1 = pw.charAt(0);
		char ch2 = pw.charAt(1);
		char ch3 = pw.charAt(2);
		char ch4 = pw.charAt(3);
		
		if(pw.length()>4) {
			System.out.println("자리수 안 맞음");
		}else if (ch1==ch2 || ch1==ch3 || ch1==ch4 || ch2==ch3 || ch2==ch4 || ch3==ch4){
			System.out.println("실패");
		}else {
			System.out.println("성공");
		}
	}

}