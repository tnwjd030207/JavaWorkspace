package com.kh.practice.book.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.kh.practice.book.model.vo.Book;

public class BookDAO {
	private Book[] bArr = new Book[10];

	public void fileSave(Book[] bArr) {

	}

	public Book[] fileRead() {
		try (ObjectInputStream ois = new ObjectInputStream
				(new FileInputStream("book.txt"));){
			
			while(true) {
				book b = (Book) ois.readObject();
				bArr[index] = b;
				index += 1;
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			}catch (EOFException  e) {
				//파일의 끝
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return bArr;
	}
}
