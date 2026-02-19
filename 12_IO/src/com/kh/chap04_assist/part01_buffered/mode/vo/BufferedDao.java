package com.kh.chap04_assist.part01_buffered.mode.vo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
		//BufferedWriter / Reader
	
	public void fileSave() {
		try {
		//보조스트림이 Writer 계열이라면, 기반스트림도 Writer로 생성해줘야 한다	
		BufferedWriter bw = null;
		bw = new BufferedWriter(new FileWriter(new File("c_buffer.txt")));
		bw.write("안녕하세요?");
		bw.newLine();//개행문자 넣어주는 메서드
		bw.write("반갑습니다\n");
		
		bw.flush(); //버퍼공간(8kb)을 비워주는 메서드. close() 호출 시 자동 호출.
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				
		 	}catch(IOException e) {
				
			}
		}
	}
	
	public void fileRead() {
		/*
		 * try ~ with ~ resource 구문 (jdk7이상)
		 * 
		 * try(스트림객체생성 ; ...){
		 *	//코드
		 * }catch (예외클래스){
		 * 
		 * }
		 * 스트림객체를 try에 붙여넣으면 스트림객체 생성 후 해당 브록의 구문이 실행 완료됨ㄴ
		 * 알아서 자원을 반납 (close)한다
		 */
		
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	} 

}
