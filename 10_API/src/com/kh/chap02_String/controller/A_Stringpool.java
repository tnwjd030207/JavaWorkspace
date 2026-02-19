package com.kh.chap02_String.controller;

public class A_Stringpool {
	/*
	 * String은 불변클래스 : 값이 바뀌지 않는다
	 * String은 기존에 담겨있던 값이 수정되는 순간 원래 담겨있던 공간에서 수정되지 않고,
	 * 새로운 저장공간을 할당한 후, 거기에 값을 추가한다
	 */
	
	//1. 문자열 상수 풀 (String constant pool)
	//- 문자열 데이터가 담기는 영역으로, Heap메모리 영역에 항상 고정적으로 할당되어 있다
	public void method1() {
		String str1 = new String ("Hello");
		String str2 = new String ("Hello");
		
		System.out.println(str1 == str2); //false(주소값 비교)
		System.out.println(str1); // toString () 메서드가 오버라이딩 되어 있음
		System.out.println(str2);
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.hashCode()); //주소값 반환 메서드
		System.out.println(str2.hashCode());
		//기존 hadjcode()는 16진수 메모리 주소값을 10진수로 변환하는 메서드
		//String의 hashcode()메서드의 경우 주소값이 아닌 담긴 문자열을 10진수로 변환해주는 메서드로 오버라이딩이 되어 있다
		
		//실제 참조변수 의 추소값을 확인하는 메서드
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
	
	//2. 문자열 리터럴로 변수 초기화
	public void method2() {
		String str = new String("hello");
				
				String str2 = "hello";
				String str3 = "hello";
				String str4 = "hello";
				
				
				/*
				 * 자바에서는 문자열 리터럴 사용시 상수풀에 값을 저장한다
				 * 
				 * 문자열 상수풀 동작방식 (jvm)
				 * 1. 프로그램 실행 도중 문자열 리터럴을 만나면, 
				 * 	  우선 문자열 릴터럴 값이 이미 상수 풀에 보관되어 있나 검사를 진행 (intern)
				 * 2. 만약 상수풀에 저장된 리터럴 값이 아니라면, 
				 *    문자열의 hashCode함수를 호출하고 그 값을 상수풀의 주소값으로 활용하여 값을 저장한다
				 * 3. 만약 이미 상수풀에 그 값이 저장되어 있다면, 저장되어있는 주소값을 반환한다 (얇은 복사)
				 */
				
				/*
				 * hachVode 메서드 오버라이딩한 이유
				 * - 문자열은 문자열기반 hashCode값을 상수풀상의 주소값으로 사용하고 있다.
				 * 	 따라서 상수풀안에 데이터를 지정할 때 문자열을 해시코드 값으로 변환한 후 그 자리에
				 * 	 데이터가 있는지, 없는자 검사를 실행하고, 이미 같이 있다면 해당 주소갓을 변수에 할당하거나
				 *  데이터가 없었다면 상수풀에 새롭게 값을 등록하고 그 주소값을 반환한다
				 */
				
				System.out.println(str == str2); //false
	           System.out.println(str == str2); // true
	           
	           System.out.println(str2.hashCode());
	           System.out.println(str3.hashCode());
	           
	           System.out.println(System.identityHashCode(str));
	           System.out.println(System.identityHashCode(str2));
	           System.out.println(System.identityHashCode(str3));
	}
	
	/*
	 * 자바에서 가장 많이 사용되는 자료형은 String
	 * String이 메모리 영역에서 차지하는 비중이 크기 때문에 메모리 부족 이슈가 종종 발생
	 * 이 메모리 부족 이슈를 해결하기 위해 나온 기능이 '문자열 상수 풀'
	 * 
	 * 단, 문자열 상수 풀로도 감당이 불가능할 정도의 문자열 연산이 자주 사용되는 프로그램이라면
	 * 문자열보다는 문자열기반 가변클래스인 (StringBuffer, StringBuilder)를 사용하는 것을 권장
	 */
	
	public void merhod3() {
		String str = "Hello";
		System.out.println(System.identityHashCode(str));
		
		str = "goodbye";
		System.out.println(System.identityHashCode(str));
		
		str += "abc";
		System.out.println(System.identityHashCode(str));
	}
}
