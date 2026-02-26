package 형변환실습문제;

import java.util.Scanner;

public class 형변환 {
Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.print("국어 :");
		double kor = sc.nextDouble();
		System.out.print("영어 :");
		double eng = sc.nextDouble();
		System.out.print("수학 :");
		double math = sc.nextDouble();
		
		int avg = (int)((kor+eng+math)/3);
		System.out.println("총점 :"+((int)(kor+eng+math)));
		System.out.println("평균 :"+avg);
	}
	
	
	public static void main(String[] args) {
		형변환 a = new 형변환();
		a.practice1();
	}
}
