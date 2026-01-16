package 배열_실습문제;

import java.util.Scanner;

public class 배열 {
	Scanner sc = new Scanner(System.in);
	/*
	 * 인덱스 : 값을 찾아오기 위해서 주는 주소. 관리, 수정 (배열 리스트)
	 */

	public void practice1() {
		// 길이가 10인 배열 선언
		// 1~10까지의 값을 반복문을 이용하여 역순으로 출력

		int[] arr = new int[10];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		arr[7] = 8;
		arr[8] = 9;
		arr[9] = 10;

		for (int i = arr.length; i > 0; i--) {
			System.out.print(i + " ");
		}

	}

	public void practice2() {
		System.out.print("양의 정수 :");
		int num = sc.nextInt();
		
		int [] arr = new int [num];
		
		for(int i=1; i<=arr.length; i++) {
			System.out.print(i+" ");
		}
	}
	
	public void practice3() {
		//10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
		//1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력
		
		int [] arr = new int [10];
		
		for(int i=0; i<10; i++) {
			arr[i] = (int)(Math.random()*10+1);
			System.out.print(arr[i]+" ");
		}
		
		
	}
	
	public void practice4() {
		//월~일까지 초기화된 문자배열 만들기
		//0~6까지 숫자 입력 받기
		//입력한 숫자와 같은 인덱스에 있는 요일 출력
		//없는 숫자 입력시 잘못 입력하셨습니다를 출력
		String [] arr = new String [7];
		
		arr[0] = "월요일";
		arr[1] = "화요일";
		arr[2] = "수요일";
		arr[3] = "목요일";
		arr[4] = "금요일";
		arr[5] = "토요일";
		arr[6] = "일요일";
		
		System.out.print("0~6 사이 숫자 입력 :");
		int num = sc.nextInt();
		
		switch(num) {
		case 0:
			System.out.println(arr[0]);
			break;
		case 1:
			System.out.println(arr[1]);
			break;
		case 2:
			System.out.println(arr[2]);
			break;
		case 3:
			System.out.println(arr[3]);
			break;
		case 4:
			System.out.println(arr[4]);
			break;
		case 5:
			System.out.println(arr[5]);
			break;
		case 6:
			System.out.println(arr[6]);
			break;
			default : 
				System.out.println("잘못 입력하셨습니다");
		}
		
		
	}
	
	public void practice5(){
		//사용자가 배열의 길이를 직접 입력, 그 값 만큼 정수형 배열을 선언 및 할당
		//배열의 크기만큼 사용자가 직접 값을 입력
		//배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합 출력
		
		System.out.print("정수: ");
		int num = sc.nextInt();
		
		int [] arr = new int [num];
		
		int sum = 0;
		
		for(int i=0; i<num; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 :");
			int num2 = sc.nextInt();
			arr[i] = num2;
			sum += num2;
		
		}
		System.out.print("총 합 :"+sum);
	}
	
	public void practice6() {
		//문자열 입력 받기
		//어떤 문자가 들어갔는지 배열에 저장
		//문자 개수 출력
		
		System.out.print("문자열 :");
		String str = sc.next();
		
		char [] arr = new char [str.length()];
		
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
			
			for(int j=0; j<=i j++) {
				if(i == j) {
					continue;
				}
			} System.out.println(arr[i]);
			
		}
		System.out.print("문자열에 있는 문자 :");
		System.out.println("문자 개수 :");
	}	
}
