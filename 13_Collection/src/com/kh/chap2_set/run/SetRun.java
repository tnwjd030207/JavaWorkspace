package com.kh.chap2_set.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.kh.chap2_set.model.vo.Student;

public class SetRun {
	public static void main(String[] args) {
		
		
		/*
		 * Set
		 * 	- 중복을 허용하지 않는다
		 * 	- 저장된 순서를 보장하지 않는다
		 * 	
		 * HashSet : 중복을 허용하지 않고 "빠르게" 저장 및 조회가 가능한 자료구조
		 * LinkedHashSet : 중복을 허용하지 않지만, 저장된 순서를 유지
		 * TreeSet : 중복을 허용하지 않지만, 오름차순정렬(기본값)을 지원
		 * 	
		 */
		
		HashSet<String>ha1 = new HashSet<>();
		ha1.add("반갑습니다");
		ha1.add("반갑습니다");
		ha1.add("여러분");
		ha1.add("안녕하세요");
		ha1.add("여러분");
		// 저장순서X 중복값 저장X
		System.out.println(ha1);
		// 리스트의 길이
		System.out.println(ha1.size());
		// 값 삭제
		System.out.println(ha1.remove("여러분"));
		System.out.println(ha1);
		
		System.out.println("=======================================");
		
		/*
		 * HashSet이 객체를 저장하는 알고리즘
		 * 1. 객체의 hashCode()메서드로 객체를 저장할 위치(주소값)을 찾는다
		 * 2. 저장한 위치에 이미 저장된 값이 있다면 equals()을 통해 저장된 값과
		 *    새로 추가할 값이 같은지 검사한다
		 * 3. 두 값이 같다면 데이터를 중복으로 저장하지 않고, 
		 *    두 값이 다르다면 저장된 값의 다음 위치에 새로운 값을 저장한다
		 */
		
		Set<Student> ha2 = new HashSet<>();
		ha2.add(new Student("공유", 40, 100));
		ha2.add(new Student("유", 60, 100));
		ha2.add(new Student("공", 30, 100));
		ha2.add(new Student("공유", 60, 100));
		
		System.out.println(ha2);
		System.out.println(ha2.size());
		
		Student s1 = new Student("류수정", 30, 50);
		Student s2 = new Student("류수정", 30, 50);
		System.out.println(s1.equals(s2)); //true
		
		System.out.println("=======================================");
		//set계열 클래스 반복처리
	
		//1. for문 활용하여 반복처리
		// 	- 기본 basic Loop문은 사용 불가
		for(student s : hs2) {
			System.out.println(s);
		}
		
		//2. Iterator를 통한 반복
		//	-List계열과 Set계열에서는 Iterator를 직접 구현하였기 때문에
		//	 사용이 가능하나, Map계열에서는 바로 호출이 불가능
		Iterator<Student>iter = ha2.spliterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		
		
		
		// List <--> Set
		// 1. List/Set에 Set/List계열 데이터를 추가하는 방법
		//	매개변수 생성자
		List<Student>list = new ArrayList<>(ha2);
		
		// 2. List에 Set계열 데이터를 추가하는 방법
		List<Student>list2 = new ArrayList<>();
		list.addAll(ha2);
		
		//LinkedHashSet
		//	- 저장순서 유지!!!
		Set<Integer> set1 = new LinkedHashSet<>();
		set1.add(34);
		set1.add(4545);
		set1.add(111);
		set1.add(1);
		
		//TreeSet
		//	- 데이터를 정렬 (기본 오름차순) 시켜서 보관
		Comparator<Integer> comp = Collections.reverseOrder();
		
		Set<Integer> set2 = new TreeSet<>(); //정수 내림차수 정렬조건을 가진 객체
		set2.addAll(set1);
		
		System.out.println(set2);
		
		
		
		
	}

}
