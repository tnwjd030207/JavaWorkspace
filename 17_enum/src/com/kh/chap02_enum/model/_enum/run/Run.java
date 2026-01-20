package com.kh.chap02_enum.model._enum.run;

import com.kh.chap02_enum.model._enum.Carcolor;

public class Run {
	public static void main(String[] args) {
System.out.println(Carcolor.BLACK);
System.out.println(Carcolor.BLACK.getCarColor());
System.out.println(Carcolor.valueOf("BLACK"));
System.out.println(Carcolor.valueOf(1));
System.out.println(Carcolor.valueOf(10));
Carcolor.RED.printTest();
	}
}
