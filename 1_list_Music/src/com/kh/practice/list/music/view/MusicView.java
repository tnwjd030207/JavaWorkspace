package com.kh.practice.list.music.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {

	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();

	public void mainMenu() {
		while (true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력 ");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료"); // 종료 출력 후 main으로 리턴
			System.out.println("메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
			case 1:
				addList();
				break;
			case 2:
				addAtZero();
				break;
			case 3:
				printAll();
				break;
			case 4:
				searchMusic();
				break;
			case 5:
				removeMusic();
				break;
			case 6:
				setMusic();
				break;
			case 7:
				ascTitle();
				break;
			case 8:
				descSinger();
				break;
			case 9:
				System.out.println("종료");
				continue;
			default:
				System.out.println("번호를 다시 선택해주세요.");
				break;
			}
		}
	}

	public void addList() {
		System.out.println("****** 마지막 위치에 곡 추가 ******");
		System.out.println("곡명 :");
		String title = sc.nextLine();
		System.out.println("가수 :");
		String singer = sc.nextLine();

		int num = mc.addList(new Music(title, singer));

		
		if (num == 1) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
	}

	public void addAtZero() {
		System.out.println("****** 첫 위치에 곡 추가 ******");

		System.out.println("곡명 :");
		String title = sc.next();
		System.out.println("가수 :");
		String singer = sc.next();
		int num = mc.addAtZero(new Music(title, singer));

		if (num == 0) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
	}

	public void printAll() {
		System.out.println("****** 전체 곡 목록 출력 ******");
		System.out.println(mc.printAll());
	}

	public void searchMusic() {
		System.out.println("****** 특정 곡 검색 ******");
		List list = mc.printAll();

		System.out.println("검색할 곡 이름 :");
		String title = sc.next();
		
		
		Music m = (Music) mc.searchMusic(title);
		
		if (m == null) {
			System.out.println("검색한 결과가 없습니다");
		} else {
			System.out.println();
		}
	}

	public void removeMusic() {
		System.out.println("****** 특정 곡 삭제 ******");
		System.out.println("삭제할 곡 이름 :");
		String title = sc.next();
		
		mc.removeMusic(title);
		
	}

	public void setMusic() {
		System.out.println("****** 특정 곡 정보 수정 ******");
		System.out.print("수정할 곡 검색 :");
		String title = sc.nextLine();

		System.out.print("수정할 곡명 :");
		String title2 = sc.nextLine();
		System.out.print("수정할 가수명 :");
		String singer = sc.nextLine();
		
		Music m = mc.setMusic(title, new Music(title2, singer));
		
		if(m ==  null) {
			System.out.println("수정할 곡이 없습니다");
		}else {
			System.out.println(m+"의 값이 변경 되었습니다");
		}
	}

	public void ascTitle() {
		System.out.println("****** 곡 명 오름차순 정렬 ******");
		int resuly = mc.ascTitle();
		
		if(result == 1) {
			System.out.println("정렬 성공");
		}else {}
			System.out.println("정렬 실패");
		mc.ascTitle();
	}

	public void descSinger() {
		System.out.println("****** 가수 명 내림차순 정렬 ******" + "");
		
		
		mc.descSinger();
	}
}
