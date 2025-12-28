package com.kh.practice.comp.func;

import java.util.Scanner;
//종합 과제
public class UpAndDown {
	Scanner sc = new Scanner(System.in);
	public void upDown(){
		System.out.println("1부터 100 사이의 임의의 난수를 맞춰보세요 :");
		int count = 0;
		int num = 0;
		int ran = (int)(Math.random()*100)+1;
		
		while(num!=ran) {
			num = sc.nextInt();
			count++;
			if(num<ran)
			{
				System.out.println("up!");
				}else if (num>ran){
					System.out.println("down!");
				} 
			
			}
		System.out.println("정답입니다."+count+"회만에 맞추셨습니다.");
			
	}
	
}