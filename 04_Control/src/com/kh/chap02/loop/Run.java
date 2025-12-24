package com.kh.chap02.loop;

public class Run {
	public static void main(String[] args) {
		A_For af = new A_For();
		// af.method5();

		B_While bw = new B_While();
		// bw.method5();

		LoopPractice ln = new LoopPractice();
		// ln.practice5();

		test tt = new test();
		// tt.practice4();

		test1();
	}

	// i 4 = 4 
	// 중첩 반복문!!!!
	public static void test1() {
		
		for (int i = 1; i <= 4; i++) {
			
			for (int j = 1; j <= 4-i+1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
