package com.kh.run;

import com.kh.chap01.condition.A_If;
import com.kh.chap01.condition.B_Switch;
import com.kh.chap01.condition.ControlPractice;
import com.kh.chap02.loop.A_For;
import com.kh.chap02.loop.B_While;

public class Run {
	public static void main (String[] args) {
		A_If ai = new A_If();
		//ai.method6();
		
		B_Switch bs = new B_Switch();
		//bs.method2();
		
		ControlPractice co = new ControlPractice();
		//co.practice7(); 
		
		A_For af = new A_For();
		//af.method9();
		
		B_While bw = new B_While();
		bw.method2();
		}
}
