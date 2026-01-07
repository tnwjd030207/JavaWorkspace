package com.kh.practice.chap01_poly.controllercom.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	public void  mainMenu() {
		
	}
	public void selectAll() {
	
	}
	public void  searchBook() {
		System.out.println("검색할 제목 키워드 :");
		String keyword = sc.next();
		
		Book[] searchBookList = lc.serchBook(keyword);
		System.out.println(b);
	} 
	public void  rentBook() {
		selectAll();
		System.out.println("대여할 도서 번호 선택 :");
		int index = sc.nextInt();
		int result = lc.renBook(index);
		
		if(result==0) {
			System.out.println("성공적으로 대여");
			
		} else id(result==1) {
			
		} else {
			
		}
	}
}
