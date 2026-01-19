package Lamda;

public class 실습문제2 {
	    public static void main(String[] args) {
	    	
	        // 1. Calculator<Integer>로 두 수의 곱셈 결과를 반환하는 람다식
	        Calculator<Integer> adder = (v1, v2) ->  v1*v2;

	        // 2. Calculator<Integer>로 두 수 중 큰 값 반환(max) 람다식
	        Calculator<Integer> findMax = (v1, v2) -> Math.max(v1, v2);

	        // 3. Calculator<String>로 "hello", "world" 입력 시 "hello-world"가 나오도록 작성
	        Calculator<String> combiner = (v1, v2) -> v1+"-"+v2;

	        // 테스트 출력 (선택 사항)
	        System.out.println(adder.operate(10, 5));
	        System.out.println(findMax.operate(10, 20));
	        System.out.println(combiner.operate("hello", "world"));
	    }

	    @FunctionalInterface
	    interface Calculator <V> {
	        V operate(V v1, V v2);
	    }
}
