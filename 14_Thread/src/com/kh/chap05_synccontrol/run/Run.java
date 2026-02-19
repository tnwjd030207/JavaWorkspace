package com.kh.chap05_synccontrol.run;

import com.kh.chap05_synccontrol.model.thread.Consumer;
import com.kh.chap05_synccontrol.model.thread.Data;
import com.kh.chap05_synccontrol.model.thread.Provider;

//포기해도 됨
public class Run {
public static void main(String[] args) {
		// 공유자원
		Data data = new Data();
		Thread provider = new Thread(new Provider (data));
		Thread consumer = new Thread(new Consumer (data));
		
		provider.start();
		consumer.start();
}
}
