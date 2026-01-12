package com.kh.chap2_set.model.vo;

public class Student {
	private String name;
	private int age;
	private int score;
	
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
	/*
	 * 서로 다른 객체의 필드값이 동일하다면 같은 객체가 될 수 있게 하기 위해선?
	 * 1. equals 매서드 오버라이딩
	 * 2. hashCode 메서드 오버라이딩
	 */
	public boolean equals(Object o) {
		
		//매개변수로 전달받은 
		if(!(o instanceof Student)) {
			return false;
		}
		
		
		boolean result = false;
		
		Student s = (Student)o;
		
		// 이름, 나이, 점수가 모두 같다면...
		if(this.name.equals(s.name)
				&& this.age == s.age
				&& this.score == s.score) {
			result = true;
		}
		return result;
		
	}
	/*
	 * hashCode()
	 * 	- Objectd의 hashCode는 저장된 주소값을 10진수 형태로 반환해주는 메서드
	 * 	- hashCode는 HashMap, HashSet에서 데이터를 저장하기 위한 Key값에 사용되도록 하는 메서드
	 *	- hashCode를 오버라이딩하지 않고 equals메서드만 오버라이딩하게 되면 논리적으로 두 객체는 
	 *	  같음을 판다할 수 있지만, 데이터가 저장될 때는 서로 다른 주소값을 가지므로, 중복으로 데이터가 저장되어 버린다
	 *	- 즉, hashCode는 객체의 주소값으로 활용된다
	 */	
	
	public int hashCode() {
		// 공유 40100
		return (name + age + score).hashCode();
	}
	
}
