package com.kh.chap01.before;

import com.kh.chap01.before.model.vo.Smartphone;

public class BrforeRun {
	public static void main(String[] args) {
	
			//데스크탑 객체
			DeskTop d = new DeskTop("삼성", "d-01","데탑", 20000000,true);
			//스마트폰 객체
			Smartphone sp = new Smartphone("애플","s-01","데탑",10000,"kt");
					
			System.out.println(d.information());
			System.out.println(sp);
			
			
			 /* 
			 * 매 클래스마다 중복된 코드들을 일일히 기술해두게 되면
			 * 수정과 유지보수에서 번거로움이 발생함
			 * 
			 * 상속이라는 개념을 적용시켜서
			 * 매 클래스에 존재하는 중복된 필드 및 메서드를 하나의 클래스에 정의해두고, 
			 * 이 클래스를 상속시켜주는 방식으로 작업한
			 */
	}
}
