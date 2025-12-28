package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {
	Scanner sc = new Scanner(System.in);
	 public void rps(){
		 System.out.println("당신의 이름을 입력해주세요 :");
		 String name = sc.next();
		 
		 int ran = (int)(Math.random()*3); //0 1 2
		String user = sc.next();
		 
		 String com = "";
		 
		 if (ran == 0) {
			    com = "가위";
			} else if (ran == 1) {
			    com = "바위";
			} else {
			    com = "보";
			}
				 
				 
	 }
}