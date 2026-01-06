package practice3.controller.Animal;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class Manager {
	public static void main(String[] args) {
		Animal d1 = new Dog("류수정", "인간", 0);
		Animal c = new Cat();
		
		Animal arr[] = new Animal[5];
		arr[0] = d1;
		arr[0].speak();
		
		//반복문을 통해서 해당 배열의 0번 인덱스부터 마지막 인덱스까지 객체의 speak() 메소드 호출
	}

}
