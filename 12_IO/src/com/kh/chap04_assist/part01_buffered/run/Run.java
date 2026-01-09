package com.kh.chap04_assist.part01_buffered.run;

import java.io.BufferedWriter;

public class Run {
	public static void main(String[] args) {
		/*
		 * 보조 스트림
		 * 	- 기반스트림의 부족한 성능이나 기능을 추가할 수 있는 스트림
		 * 	- 보조 스트림은 단독으로는 사용 불가능
		 * 
		 * [표현법]
		 * 보조스트림 변수명 = new 보조스트림(기반스트림 객체);
		 * 보조스트림1 변수명 = new 보조스트림1(new 보조스트림2(기반스트림 객체));
		 * 
		 * BufferedXXX
		 * 	- 속도 성능 향상 목적의 보조 스트림
		 * 	- 내부적으로 버퍼 공간을 제공하여 데이터를 모아뒀다가 한 번에 입출력을 진행
		 */
		
		BufferedWriter dao = new BufferedWriter();
		dao.fileSave();
	}
}
