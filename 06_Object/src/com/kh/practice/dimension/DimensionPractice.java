package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {
	public void practice1() {
		int [][] arr = new int [3][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = j;
				System.out.print(i + "," + arr[i][j]+" ");
			}
			System.out.println();
		}		
		
		
	}
	public void practice2() {
		int [][] arr = new int [4][4];
		
		int value = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}		
		
		
	}
	
	public void practice3() {
		int [][] arr = new int [4][4];
		
		int value = 16;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value--;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
	}
	
		

	}
	public void practice4() {
		int [][] arr = new int [4][4];
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr[i].length-1; j++) {
				arr[i][j] = (int)(Math.random()*10+1);
				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];
				arr[3][3] += arr[i][j] *2;
			}
		}
			for(int i=0; i<arr.length; i++)	{
				for(int j=0; j<arr[i].length; j++) {
					System.out.print(arr[i][j]+" ");
					
				}
				System.out.println();
			}
			
		
			
	}
		public void practice5() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("행 크기 :");
			int withd = sc.nextInt();
			
			System.out.println("열 크기 :");
			int height = sc.nextInt();
		
			if(!(1<=withd&&withd<=10&&1<=height&&height<=10)) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				practice5();
				return;
			}
			
			int ran = (int)(Math.random()*26)+65;
			char arr [][] = new char[withd][height];
			
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					arr[i][j] = (char)((int)(Math.random()*26+65));
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			
			
			
			
			
			
			}
		public void practice6() {

String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원",
"열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};

		}
		
		
		public void practice7() {
			
		}
}

