package com.kh.practice.book.view;

import java.util.Calendar;
import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {
Scanner sc = new Scanner(System.in);

private BookController bc = new BookController();
private Book[] bArr;

public BookMenu() {

}

public void  mainMenu() {
	while(true) {
	System.out.println("1. 도서 추가 저장");
	System.out.println("2. 저장 도서 출력");
	System.out.println("9. 프로그램 끝내기");
	System.out.print("메뉴 번호 :");
	int menu = sc.nextInt();
	
	switch(menu) {
	case 1 : fileSave();
	return;
	case 2 : fileRead();
	case 9 : 
		return;
	default	:
		return;
	
	}
	}
}
public void  fileSave() {
	System.out.print("도서 명 :");
	String title = sc.next();
	
	System.out.print("저자 명 :");
	String author = sc.next();
	
	System.out.print("도서 가격 :");
	int price = sc.nextInt();
	
	System.out.print("출판 날짜(yyyy-mm-dd");
	String date = sc.next();
	
	String[] arr = date.aplit("-");
	Calender cal = Calendar.getInstance();
	cal.set(Intger.parseInt(arr))
	
	System.out.print("할인율 :");
	double discount = sc.nextDouble();
	
	Book b = new Book (title, author, price, date, discount);
	//비어있는 Book 객체 배열 (bArr)에 담아
				
	for() {
		
	}		
}
public void  fileRead() {
	
}

}
