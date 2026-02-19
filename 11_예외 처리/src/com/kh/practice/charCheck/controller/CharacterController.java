package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {

	public CharacterController() {

	}

	public int countAlpha(String s) throws CharCheckException {
		/*
		 * 매개변수로 들어온 값에 영문 자가 몇 개 들어있는지 반환
		 */

		if (s.contains(" ")) {
			throw new CharCheckException("체크할 문자열 안에 공백이 있어 오류입니다.");
		}

		char[] arr = s.toUpperCase().toCharArray();
		int count = 0;

		for (char ch : arr) {
			// 각 문자가 영문자인지 검사
			// 'A' 'Z'
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				count++;
			}
		}
		return count;

	}
}
