package ch03_problem;

public class practice10 {

	public static void main(String[] args) {
		int arr[][] = new int[4][4];
		
//		입력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = 0;				
			}
		}//for
		
		
//		1. for 문
//		for(int i=0; i<10; i++) {
//			int row = (int)(Math.random()*4);
//			int col = (int)(Math.random()*4);
//			
//			if(arr[row][col] == 0)
//				arr[row][col] = (int)(Math.random()*10+1);
//			else
//				i--;
//		}
		
//		2. while 문 
		int cnt=0;
		
		while(cnt<10) {
			int row = (int)(Math.random()*4); //정수 1~4
			int col = (int)(Math.random()*4);
			
			if(arr[row][col] == 0) {
				arr[row][col] = (int)(Math.random()*10+1); // 정수 1~10
				cnt++;
//			else
//				i--;
//			
			}
		}
		
		
//		출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
				System.out.print(arr[i][j]+"\t");

			}
			System.out.println();
			
		}//for
		
	}//main

}
