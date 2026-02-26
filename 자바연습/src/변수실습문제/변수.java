package 변수실습문제;

import java.util.Scanner;

public class 변수 {
Scanner sc = new Scanner(System.in);

	public void practice1(){
	System.out.print("이름 입력 :");
	String name = sc.next();
	System.out.print("성별 입력(남/여) :");
	char gender = sc.next().charAt(0);
	System.out.print("나이 입력 :");
	int age = sc.nextInt();
	System.out.print("키 입력 :");
	double height = sc.nextDouble();
	
	System.out.println("키 "+height+"인 "+age+"살 "+gender+" "+name+"님 반갑습니다^^");
	}

	public void practice2() {
		System.out.print("첫 번째 정수 :");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 :");
		int num2 = sc.nextInt();
		
		System.out.println("더하기 결과"+(num1+num2));
		System.out.println("빼기 결과"+(num1-num2));
		System.out.println("곱하기 결과"+(num1*num2));
		System.out.println("나누기 몫 결과"+(num1/num2));
	}
	
	public void practice3() {
		System.out.print("가로 :");
		double width = sc.nextDouble();
		System.out.print("세로 :");
		double height = sc.nextDouble();
		
		System.out.println("면적 :"+(width*height));
		System.out.println("둘레 :"+((width+height)*2));
	}
	
	public void practice4() {
		System.out.print("문자열을 입력하세요 :");
		String str = sc.next();
		
		System.out.println("첫 번째 문자 :"+str.charAt(0));
		System.out.println("두 번째 문자 :"+str.charAt(1));
		System.out.println("세 번째 문자 :"+str.charAt(2));
	}
	
	
	public static void main(String[] args) {
		변수 a = new 변수();
		a.practice4();
	}
}
