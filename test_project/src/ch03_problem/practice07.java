package ch03_problem;

public class practice07 {

	public static void main(String[] args) {
		int arr[] = new int[3];
		
		for(int i=0; i<arr.length; i++) {
			 arr[i] = (int)(Math.random()*10 +1);			 
		}		
		
		double sum=0;
		System.out.print("랜덤한 정수: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum = sum + arr[i];
		}
		System.out.println();
		System.out.println("평균: " + sum/arr.length);
	}

}
