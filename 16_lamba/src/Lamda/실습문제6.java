package Lamda;

import javax.management.RuntimeErrorException;

public class 실습문제6 {
	    public static void main(String[] args) {
	    	
	    	
	    	
	    	
	    	
	    	switch(mode) {
	    	case "length" -> 
	    					comp = (s1, s2) -> s1.length() = s2.length();
	    	case "reverse" ->
	    					comp = (s1, s2) -> s2.compareTo
	    	default -> //예외처리
	    		throw new RuntimeErrorException("존재하지 않는 정렬기준입니다");
	    	
	    	}
	    	
	    	
	        // 더하기 연산자 받기
	        BiFunction<Integer, Integer, Integer> op = getOperator("+");
	        System.out.println(op.apply(10, 5)); // 출력: 15

	        // 곱하기 연산자 받기
	        op = getOperator("*");
	        System.out.println(op.apply(10, 5)); // 출력: 50
	    }

	    public static BiFunction<Integer, Integer, Integer> getOperator(String type) {
	        // 문자열로 전달된 연산자("+", "-", "*", "/", "%")에 따라
	        // 적절한 BiFunction<Integer, Integer, Integer> 람다식을 반환하도록 구현하시오.
	        
	        // 여기에 switch문이나 if-else문을 사용하여 람다를 리턴하는 코드를 작성하세요.
	    }

}
