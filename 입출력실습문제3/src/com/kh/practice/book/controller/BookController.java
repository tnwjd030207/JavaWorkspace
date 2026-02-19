package com.kh.practice.book.controller;

import java.io.File;

import com.kh.practice.book.model.dao.BookDAO;
import com.kh.practice.book.model.vo.Book;

public class BookController {
	private  BookDAO bd = new BookDAO();
	
	public void  makeFile() {
		File f = new File("book.txt");
	}
	public void  fileSave(Book[] bArr) {
		return bd.fileRead();
	}
	public Book[]  fileRead() {
	}
 
}
