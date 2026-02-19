package Lamda;

public class 실습문제3 {
	    public static void main(String[] args) {
	        
	        // 1. 입력 문자열을 대문자로 변환하여 반환
	        MyFunction<String, String> first = (v) -> v.toUpperCase();
	        //													String::toUpperCase;				

	        // 2. 문자열 길이가 5 이상인지 여부(boolean)를 반환
	        MyFunction<String, Boolean> second = (v) ->  v.length()>=5;

	        // 3. "lambda" 입력 시 "l-a-m-b-d-a" 형태로 반환 (구분자 넣기)
	        MyFunction<String, String> third = (v) -> String.join("-", v.split(""));
	        // v.split() : 문자열을 한 글자씩 잘게 쪼개서 배열로 만드는 기능		

	        // --- 출력 테스트 ---
	        System.out.println("1번 대문자: " + first.apply("hello"));      // HELLO
	        System.out.println("2번 5글자 이상?: " + second.apply("abc")); // false
	        System.out.println("3번 글자 쪼개기: " + third.apply("lambda")); // l-a-m-b-d-a
	    }

	    @FunctionalInterface
	    interface MyFunction<V, B> {
	        B apply(V v);
	    }
}
