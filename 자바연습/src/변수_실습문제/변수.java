package 변수_실습문제;

import java.util.Scanner;

public class 변수 {
	Scanner sc = new Scanner(System.in);
	public void method1() {
		System.out.print("이름을 입력하세요.:");
		String name = sc.next();
		
		System.out.print("성별을 입력하세요.:");
		char gender = sc.next().charAt(0);
		
		System.out.print("나이를 압력하세요.:");
		int age = sc.nextInt();
		
		System.out.print("키를 입력하세요(cm):");
		double k = sc.nextDouble();
		
		System.out.println("키 "+k+"cm인 "+age+"살 "+gender+"자 "+name+"님 반갑습니다^^");
	}
	
	public void method2() {
		System.out.println("키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.");
		
		System.out.print("첫 번째 정수 :");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 :");
		int num2 = sc.nextInt();
		
		int plus = num1+num2;
		int min = num1-num2;
		int muit = num1*num2;
		int divi = num1/num2;
		
		System.out.println("더하기 결과 :"+plus);
		System.out.println("빼기 결과 :"+min);
		System.out.println("곱하기 결과 :"+muit);
		System.out.println("나누기 몫 결과 :"+divi);
	}
	
	public void method3() {
		System.out.println("키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.");
		
		System.out.print("가로 :");
		double width = sc.nextDouble();
		System.out.print("세로 :");
		double height = sc.nextDouble();
		
		System.out.println("면적 :"+(width*height));
		System.out.println("둘레 :"+((width+height)*2));
	}
	
	public void method4() {
		System.out.println("영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.");
		
		System.out.print("문자열을 입력하세요. :");
		String str = sc.next();
		
		System.out.print("첫 번째 문자 :"+str.charAt(0));
		System.out.print("두 번째 문자 :"+str.charAt(1));
		System.out.print("세 번째 문자 :"+str.charAt(2));
	}
	
}
