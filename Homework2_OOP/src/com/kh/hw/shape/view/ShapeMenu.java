package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	// 필드
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();

	int type;
	int menuNum;

	public void inputMenu() {
		// ===== 도형 프로그램 =====
		// 3. 삼각형 ==> triangleMenu()
		// 4. 사각형 ==> squareMenu()
		// 9. 프로그램 종료 => “프로그램 종료” 출력 후 프로그램 종료
		// 메뉴 번호 :
		// 잘못 입력했을 시 “잘못된 번호입니다. 다시 입력해주세요.” 출력 후 반복

		while (true) {
			System.out.println("==== 도형 프로그램 ====");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴 번호 :");
			type = sc.nextInt();

			if (type == 3) {
				triangleMenu();
			} else if (type == 4) {
				quareMenu();
			} else if (type == 9) {
				System.out.println("프로그램이 종료됩니다");
				break;
			} else {
				System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			}

		}

	}

	public void triangleMenu() {
		// ===== 삼각형 =====
		// 1. 삼각형 면적 ==> inputSize()
		// 2. 삼각형 색칠 ==> inputSize()
		// 3. 삼각형 정보 ==> printInformation()
		// 9. 메인으로 ==> “메인으로 돌아갑니다.” 출력 후 inputMenu()로
		// 메뉴 번호 :
		// 잘못 입력했을 시 “잘못된 번호입니다. 다시 입력해주세요.” 출력 후 반복

		while (true) {
			System.out.println("==== 삼각형 ====");
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");

			System.out.print("메뉴 번호 :");
			menuNum = sc.nextInt();

			if (menuNum == 1) {

			} else if (menuNum == 2) {
				inputSize(type, menuNum);
			} else if (menuNum == 3) {

			} else if (menuNum == 9) {
				System.out.println("메인으로 돌아갑니다.");
				break;
			} else {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		}
	}

	public void squareMenu() {
		// ===== 사각형 =====
		// 1. 사각형 둘레 ==> inputSize()
		// 2. 사각형 면적 ==> inputSize()
		// 3. 사각형 색칠 ==> inputSize()
		// 4. 사각형 정보 ==> printInformation()
		// 9. 메인으로 ==> “메인으로 돌아갑니다.” 출력 후 inputMenu()로
		// 메뉴 번호 :
		// 잘못 입력했을 시 “잘못된 번호입니다. 다시 입력해주세요.” 출력 후 반복

	}

	public void inputSize(int type, int menuNum) {
		if (type == 3 && menuNum == 1) {
			System.out.print("높이 :");
			double height = sc.nextDouble();
			System.out.print("너비 :");
			double width = sc.nextDouble();

			System.out.print("삼각형 면적 :" + tc.calcArea(height, width));
		} else {
			System.out.print("색 :");
			String color = sc.next();
			tc.paintColor(color);
			System.out.print("색이 수정되었습니다.");
		}
	}

	public void printInformation(int type) {
		// int type에 따라 print()메소드를 불러오는 controller가 다름
		// int type이 ‘삼각형’일 경우 tc.print() 출력
		// int type이 ‘사각형’일 경우 scr.print() 출력
		
		if(type==3) {
			System.out.println(tc.print());
		}else {
			System.out.println();
		}

	}
}
