package ch03_problem;

//for, while은 완벽히 대체가능함

//while문

//public class practice01 {
//
//	public static void main(String[] args) {
//		
//		int sum=0, i = 0;
//		
//		while(i<100) {
//			sum = sum + i;
//			i += 2;
//		}
//		System.out.println(sum);
//		
//	}
	
//for문

public class practice01 {

		public static void main(String[] args) {
			
			int sum = 0;
			
			for(int i=0; i<100; i+=2) {
				sum = sum + i;
			}
			System.out.println(sum);
			
		}

}	

