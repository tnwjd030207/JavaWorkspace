package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	Scanner sc = new Scanner(System.in);
	FileController fc = new FileController();

	public void mainMenu() {
		while (true) {
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 :");
			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1: {
				fileSave();
			}
			case 2: {
				fileOpen();
			}
			case 3: {
				fileEdit();
			}
			case 9: {
				System.out.println("프로그램을 종료합니다.");
			}
			}

		}

	}

	public void fileSave() {
		StringBuilder sb = new StringBuilder();

		while (true) {
			System.out.println("파일에 저장할 내용을 입력하세요.\n");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.\n");
			String str = sc.nextLine();

			if (str.equals("ex끝it")) {
				break;
			}
			sb.append(str); // 내가 입력한 값을 StringBuilder에 기록
		}

		System.out.println("저장할 파일 명을 입력해주세요 (ex. myFile.txt)");
		String fileName = sc.nextLine();

		boolean iF = fc.checkName(fileName);
		
		if (!iF) {
			fc.fileSave(fileName, sb);
			return;
		}
		while (true) {
			if (iF) {
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까? (y/n)");
				char ch = sc.nextLine().toUpperCase().charAt(0);
				if (ch == 'Y') {
					fc.fileSave(fileName, sb);
				} else {
					continue;
				}
			}
			break;
		}

	}

	public void fileOpen() {
		System.out.print("열 파일 명 :");
		String fileName = sc.nextLine();
		
		boolean exists = fc.checkName(fileName);
		
		if(!exists) {
			System.out.println("없는 파일입니다.");
			return;
			//throw new RuntimeException("없는 파일입니다.");
			
			System.out.println(fc.fileOpen(fileName));
		}
		

	}

	public void fileEdit() {
		System.out.print("수정할 파일 명 :");
	}
}
