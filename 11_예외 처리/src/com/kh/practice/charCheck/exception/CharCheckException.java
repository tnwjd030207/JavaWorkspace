package com.kh.practice.charCheck.exception;

public class CharCheckException extends Exception{
	
	//기본생성자
	public CharCheckException() {
		
	}
	
	public CharCheckException (String msg) throws CharCheckException {
		/*매개변수로 받은 값을 부모
		생성자로 넘기는 생성자*/
		super(msg);
	}
}
