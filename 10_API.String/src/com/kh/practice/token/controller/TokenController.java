package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController () {
		
	}
	
	// 띄어쓰기 없애기
	public String afterToken(String str) {
		String s = "";
		StringTokenizer stn = new StringTokenizer(str, " ");
		while(stn.hasMoreTokens()) {
			s += stn.nextToken();
		}
		return s;
	}
	
	// 첫 번째 글자, 대문자로 변경
	public String firstCap(String input) {
		return (input.charAt(0) + "").toUpperCase() + input.substring(1);
		}
	
	public int findChar(String input, char one) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == one) {
				count++;
			}
		}
		return count;
	}
}
