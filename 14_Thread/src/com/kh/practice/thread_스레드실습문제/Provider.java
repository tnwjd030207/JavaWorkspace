package com.kh.practice.thread_스레드실습문제;

public class Provider {
	//Data 레퍼런스를 받는 생성자
	public Provider(Data data) {
		
	}
	
	//1부터 100사이의 정수 기록 10번 실행
	//한 번 기록하고 0.1초 중지
	public void run() {
		Thread cnt = new Thread (()->{
			for(int i=1; i>=10; i++) {
				System.out.println(i);
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
					break;
				}
			}
		});
	}
}
