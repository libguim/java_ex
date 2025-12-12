package ch03_problem;

public class practice09 {

	public static void main(String[] args) {
		
		int arr[][] = new int[4][4];
		
		for(int i=0; i<arr.length; i++) {			
			for(int j=0; j<arr[i].length; j++) {				
				arr[i][j] = (int)(Math.random()*10 +1); //범위 정수 1~10
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}//for

	}//main

}
