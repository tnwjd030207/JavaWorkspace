package 배열_실습문제;

public class _2차원배열 {
	public void practice1() {
		String [][] arr = new String [3][3];
		
		arr[0][0]="(0, 0)";
		arr[0][1]="(0, 1)";
		arr[0][2]="(0, 2)";
		arr[1][0]="(1, 0)";
		arr[1][1]="(1, 1)";
		arr[1][2]="(1, 2)";
		arr[2][0]="(2, 0)";
		arr[2][1]="(2, 1)";
		arr[2][2]="(2, 2)";
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j]);
			}	System.out.println();
		}
	
	}
	
	
	public void practice4(){
		//4행 4열 2차원 배열 생성
		//0,0~ 2,2까지는 1~10까지의 임의의 정수 값 저장
		
		int [][] arr = new int [4][4];
		
		for(int i= 0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = (int)(Math.random()*10)+1; 
			
				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];
				arr[3][3] += arr[i][j];
				
				System.out.print(arr[i][j] + " ");
			}
		}System.out.println();
		
		
		
		
		
		
		
		
		
		
	}
}
