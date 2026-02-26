package 연산자실습문제;

import java.util.Scanner;

public class 연산자 {
Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.print("인원 수 :");
		int person = sc.nextInt();
		System.out.print("사탕 수 :");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 :"+(candy/person));
		System.out.println("남은 사탕 개수 :"+(candy%person));
	}

	public void practice2() {
		System.out.print("성별(M/F) :");
		char gender = sc.next().charAt(0);
		
		String resultGender = "";
		
		if(gender == 'M' || gender == 'm') {
			resultGender = "남학생";
		} else if(gender == 'F' || gender == 'f') {
			resultGender = "여학생";
		} else {
			resultGender = "중성";
		}
		System.out.println(resultGender);
	}

	public void practice3() {
		System.out.print();
	}
	
	
public static void main(String[] args) {
	연산자 a = new 연산자();
	a.practice2();
}
}
