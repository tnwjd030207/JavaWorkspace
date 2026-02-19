package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		CharacterController cc = new CharacterController();
		
		System.out.println("문자열 :");
		String str = sc.nextLine(); //공백을 모두 다 받을 수 있도록 nextLine
		
		try {
		System.out.println(str+"에 포함된 영문자 개수 :"+ cc.countAlpha(str));
		} catch(CharCheckException c) {
			c.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		CharacterMenu cm = new CharacterMenu();
		cm.menu();
	}
}
