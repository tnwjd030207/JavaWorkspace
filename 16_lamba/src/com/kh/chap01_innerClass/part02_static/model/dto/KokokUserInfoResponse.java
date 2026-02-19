package com.kh.chap01_innerClass.part02_static.model.dto;

import javax.xml.crypto.Data;

public class KokokUserInfoResponse {
	/*
	 * DTO (Data Transfer Object)  데이터를 전송하는 용도의 오브젝트 -> 실제로 데이터를 저장하고 보내야됨
	 * 	- 값을 전달하기 위해 사용하는 클래스
	 * 	- API서버, DB서버 등에서 데이터를 송/수신 하기 위한 용도의 객체들을 정의하는 클래스
	 * 	- VO클래스와 다르게 데이터의 "송/수신"이 주 목적이기 때문에 불필요한 메서드들이 존재하지 않는다
	 * 	   (equals, hachcode, setter ...)
	 * 	- API서버들에는 다양한 서비스들이 존재하며, 각 서비스 마다 요구하는 데이터의 형성 및 반환되는 응답의 형식이 
	 *    다양하기 때문에 이에 맞춰서 DTO클래스를 설계시 굉장히 많은 양의 클래스들이 나온다
	 * 	- 이러게 너무 많은 DTO클래스가 파일로 존재하면 관리가 힘들어지기 때문에 
	 *     필요한 클래스들을 하나의 파일로 모아서 관리하는 게 일반적이다
	 * 
	 * VO (Value Object) -> 보내지 않고 현재에 저장
	 * 	- 가치가 있는 클래스를 표현하기 위한 목적으로 사용하는 클래스
	 * 	- 객체지향적으로 설계된 클래스
	 * 	- 어플리케이션의 핵심적인 역할을 수행하는 클래스를 정의하는 클래스며,
	 * 	   데이터의 불변성이 유지되어야하기 때문에 데이터를 중간에 변경할 수 있는 Setter메서드는 정의하지 않는다
	 * 	- 캡술화 및 상속이 구현되어 있으며, equals & hashcode 등 객체의기능을 정의하는 메서드들이 있다 
	 */
	
	private Long id;
	private Data synchedAt;
	private KakaoAccount  KakaoAccount;
	
	public static class KakaoAccount{
			private boolean profileNeedsAgreement; //프로필 제공 동의 항목
			private Profile Profile;
	}
	
	public static class Profile {
		private String nickname;
		private String thumbnailImgeUrl;
	}
}
