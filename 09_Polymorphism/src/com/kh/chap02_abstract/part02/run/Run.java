package com.kh.chap02_abstract.part02.run;

import com.kh.chap02_abstract.part02.model.vo.Baby;
import com.kh.chap02_abstract.part02.model.vo.Basic;
import com.kh.chap02_abstract.part02.model.vo.Mother;
import com.kh.chap02_abstract.part02.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		// 추상클래스
		// - 객체 생성 불가, 단 참조변수로는 사용 가능
		// Person p = new person;
		Person p1 = new Mother("민경민", "출산", 70, 50);
		Person p2 = new Baby("응애", 3.5, 70);
		
		System.out.println(p1);//동적바인딩
		System.out.println(p2);
		
		p1.eat(); //동적바인딩
		p2.eat();
		p1.sleep();
		p2.sleep();
		
		System.out.println("다음날");
		System.out.println(p1);
		System.out.println(p2);
		
		
		//인터페이스
		//Basic b = new Basic(); 객체생성 불가능
		Basic b1 = new Mother("민경민", "출산", 70, 50); //참조변수로 사용 가능
		Basic b2 = new Baby ("응애", 3.5, 70); 
		
		b1.eat(); //동적바인딩
		b2.eat();
		
		System.out.println(b1); //동적바인딩
		System.out.println(b2);
	}

}
