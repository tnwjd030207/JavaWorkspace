package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		int arr [] = new int[10]; //길이가 10인 배열 선언
		// [0,0,0,0,0,0,0,0,0,0]
		
		// 배열에 값 초기화.
		arr[0] = 10;
		arr[1] = 9;
		arr[2] = 8;
		arr[3] = 7;
		arr[4] = 6;
		arr[5] = 5;
		arr[6] = 4;
		
		//배열의 길이만큼 반복 진행
		// i => 0
		// i => 1
		// i => 2...
		// i => 9
		
		int value = 10;
		for(int i=0; i<arr.length; i++) {
			arr[i] = value--; 
			System.out.print(arr[i]+" ");
		}
		
	}
	
	
	
	public void practice2() {
		System.out.print("양의 점수 :");
		int num = sc.nextInt(); 
		
		int[] arr = new int [num]; // [0,0,0,0,0]
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			
			System.out.println("arr[i]"+" ");
		}
	}
	
	
	
	public void practice3() {
		int[] arr = new int [10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			System.out.print(arr[i]+" ");
		}
	}
	
	
	
	public void practice4() {
		String[] arr = {"월","화","수","목","금","토","일"};
		
		System.out.print("0~6 사이 숫자 입력 :");
		int num = sc.nextInt();
		
		if(!(num>=0 && num<=6)) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		System.out.println(arr[num]+"요일");
				
	}
	
	
	
	public void practice5() {
		System.out.print("정수 :");
		int num = sc.nextInt();
		
		int[] arr = new int [num];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열"+i+"번째 인덱스에 넣을 값 :");
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"");
			sum+=arr[i];
		}
		System.out.println("\n총합 :" + sum);
	}
	
	
	public void practice6() {
		System.out.print("문자열 :");
		String str = sc.next();
		
		char[] arr = str.toCharArray();
		
		System.out.print("문자열에 있는 문자 :");
		int count = 0;
		// 전체 문자 반복
		for(int i=0; i<arr.length; i++) {
			char ch = arr [i]; // 중복인지 검사하고자 하는 문자
			
			// 문자 중복 검사
			// 현재 위치에서 앞쪽의 단어들 중 현재 단어와 일치하는 값이 있는지 확인
			boolean isDup = false;
			for(int j=0; j<i; j++) {
				if(ch == arr[j]) {
					//중복
					isDup = true;
					break;
				}
			}
			
			if(!isDup) {
				System.out.print(ch+",");
				count++;
			}
		}
		
		System.out.println("\n문자 개수 :"+count);
		
	}
	
	
	public void practice7(){
		System.out.print("문자열 :");
		String str = sc.next();
		
		System.out.println("문자 :");
		char ch = sc.next().charAt(0);
		
		char[] arr = str.toCharArray(); //문자를 문자배열로 변환하는 메서드
		int count = 0;
		
		System.out.print(str+"에 "+ch+"가 존재하는 위치(인덱스) :");
		System.out.println();//개행처리
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == ch){
				count++;
				System.out.print(i+" ");
			}
			
		}
		System.out.print(ch+"의 개수 :"+count);
	}
	
	public void practice8() {
		System.out.println("주민등록번호(-포함) :");
		String str = sc.next(); //str=원본배열
		
		char [] origin = str.toCharArray(); //원본배열 
		char [] copy = Arrays.copyOf(origin, origin.length); //복사본배열
		
		// 123456-1234567
		// 123456-1******
		// 주민번호 뒷자리 마스킹처리
		for (int i=8; i<copy.length; i++) {
			copy[i]='*';
		}
		
		for (int i=0; i<copy.length; i++) {
			System.out.print(copy[i]);
		}
	}
	
	public void practice9() {
		int[]arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
	}
		
		//최대값, 최소값
		int max = 1;
		int min = 1;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("\n최대값 :"+max);
		System.out.println("최소값 :"+min);
}
	public void practice10() {
		int[] arr = new int [10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			
			for(int j=0; j>i; j++) {
				//중복검사
				if(arr[j]==arr[i]) {
					i--;
					break;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice11() {
		System.out.print("정수 :");
		int num = sc.nextInt();
		
		if(!(num%2 == 1 && num>=3)) {
			System.out.println("다시 입력하세요.");
			practice11();
			return;
		}
		int[] arr = new int[num];
		
		//중앙값
		int mid = num/2;
		
		int value = 0;
		//i는 되도록 인덱스에 접근하는 용도로 사용
		for(int i=0; i<arr.length; i++) {
			//mid까지는 오름차순
			//mid이후는 내림차순
			if(i<=mid) {
				arr[i] = ++value;
			}else {
				arr[i] = --value;
			}
		}
		
	}
	//다시
	public void practice12() {
		System.out.print("배열의 크기를 입력하세요 :");
		int num = sc.nextInt();
		String [] arr = new String[num]; // [null, null, null]
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열의 크기를 입력하세요 :");
			int num = sc.nextInt();
			String [] arr = new String[num];
			
			sc.nextInt(); //개행문자 제거
			
			for(int i=0; i<arr.length; i++) {
				System.out.print(i+1+"번째 문자열 :");
				arr[i]= sc.nextLine(); //띄어쓰기 포함
			}
			
			while(true) {
				System.out.print("더 값을 입력 하시겠습니까? (Y/N)");
				char ch = sc.nextLine().charAt(0);
				
				if(ch == 'Y' || ch == 'y') {
					System.out.print("더 입력하고 싶은 개수 :");
					int num2 = sc.nextInt();
					String[] copy = Arrays.copyOf(arr, arr.length +num2 );
					
					sc.nextLine();
					
					for(int i=arr.length; i<copy.length; i++) {
						System.out.print(i+1+"번째 문자열 :");
						copy[i]= sc.nextLine(); //띄어쓰기 포함
					}
					arr=copy;//얕은복사
			}else {
				System.out.println(Arrays.toString(arr));
				break;
			}
				
			
			}
		}
	}
}