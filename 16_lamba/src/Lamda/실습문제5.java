package Lamda;

import java.util.function.BiFunction;

public class 실습문제5 {
	    public static void main(String[] args) {
	    	
	    	
	    	
	    	switch(type) {
	    	case "+" -> bi = (a, b) -> a+b;
	    	case "-" -> bi = (a, b) -> a-b;
	    	case "*" -> bi = (a, b) -> a*b;
	    	case "/" -> bi = (a, b) -> a/b;
	    	case "%" -> bi = (a, b) -> a%b;
	    		
	    	}
	    	
	    @FunctionalInterface
	    interface Calculator <V>{
	        V operate(V v1, V v2);
	    }
	
}
