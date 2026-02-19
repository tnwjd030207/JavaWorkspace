package com.kh.chap01_thread.model.thread;

public class Thread1 extends Thread {
	public void run() {
		//각 스레드가 실행할 작업을 기술하는 매서드
		for(int i=1; i<=100; i++) {
			System.out.println(("2번 스레드 ["+i+"]"));
		}
	}
}
