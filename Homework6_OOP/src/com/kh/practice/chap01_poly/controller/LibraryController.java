package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {
	private Member mem = null;
	private Book bList[] = new Book[5]; 
	
	public void  insertMember(Member mem) {
		
	}
	
	public Member mylnfo() {
		
	}
	
	public Book[] searchBook(String keyword) {
		
	}
	
	public int rentBook(int index) {
		int result = 0;
		
		Book b = bList[index];
		if(instanceof AniBook && mem.getAge() < ((Anibook)b).gerAccssAge()) {
			result = 1;
		} else if(b instanceof CookBook && ((CookBook)b).isCoupon()) {
			mem.setCouponCount(mem.getCouponCount()+1);
			result = 2;
		}
		return result;
	}
	
	
	
	
	
}
