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
		int [][] arr = new int [4][4];
		
		for(int i= 0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[2][2] = (int)(Math.random()*10)+1; 
				System.out.print(arr[2][2]+" ");
			} System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}
}
