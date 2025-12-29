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
		
		int vlaue = 6;
				
		
			
	}
		public void practice5() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("행 크기 :");
			int withd = sc.nextInt();
			
			System.out.println("열 크기 :");
			int height = sc.nextInt();
			
			
			
		
			int ran = (int)(Math.random()*26)+65;
			char arr [][] = new char[withd][height];
			
			for(int i=1; i<arr.length; i++) {
				for
			}
			
			}
		
}

