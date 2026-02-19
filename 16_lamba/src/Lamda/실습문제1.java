package Lamda;

public class 실습문제1 {
	    public static void main(String[] args) {
	    	
	        String[] arr = { "java", "lambda", "hi", "functional", "wow" };
	        // 1. 길이 3 이하 문자열
	        printStrings(arr, (str) -> str.length() <= 3);
	        
	        // 2. 문자열에 "a"가 포함된 문자열
	        printStrings(arr, (str) -> str.contains("a"));
	        
	        // 3. 문자열에 "w"로 시작하는 문자열
	        printStrings(arr, (str) -> str.charAt(0)=='w');
	        
	        // 4. 길이가 짝수, "a"가 포함된 문자열
	        printStrings(arr, (str) -> str.equals("a") && str.length()%2==0);
	    }

	    public static void printStrings(String[] arr, StringChecker checker) {
	        for (String str : arr) {
	            if (checker.check(str)) {
	                System.out.println(str);
	            }
	        }
	    }
	

	@FunctionalInterface
	interface StringChecker {
	    boolean check(String str);
	}
}
