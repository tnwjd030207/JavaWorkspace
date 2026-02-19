package Lamda;

public class 실습문제4 {
	    public static void main(String[] args) {
	    	// 학생의 이름과 점수 출력
	    	// 만약 점수가 90이상이면 A, 80이상이면 B, 70이상이면 C, 60이상이면 D 출력
	    	
	        MyFunction2<String, Integer> printer = 
	        		(k, a) -> {
	        			System.out.print(k+"님의 점수는 ");
	        			if(a>=90) {
	        				System.out.println("A학점("+a+")입니다.");
	        			}else if(a>=80) {
	        				System.out.println("B학점("+a+")입니다.");
	        			}else if(a>=70) {
	        				System.out.println("C학점("+a+")입니다.");
	        			}else if(a>=60) {
	        				System.out.println("D학점("+a+")입니다.");
	        			}else {
	        				System.out.println("F학점입니다.");
	        			}
	        		};
	          
	    	        // 테스트 호출
	    	        printer.accept("홍길동", 95); // 홍길동님의 점수는 A학점(95)입니다.
	    	        printer.accept("이순신", 88); // 이순신님의 점수는 B학점(88)입니다.
	            
	        }


	    @FunctionalInterface
	    interface MyFunction2<K, A> {
	        void accept(K k, A a);
	    }
	}

