package ch03_ex;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int intArray[];
		intArray = new int[5];
		int max = 0;
		System.out.println("양수 5개를 입력하세요.");
		
		for(int i=0; i<5; i++) {
			intArray[i] = scanner.nextInt();
			if(intArray[i] > max) { //max보다 더 큰 수로 갱신함 
				max = intArray[i]; 
			}
		}
		
		System.out.print("가장 큰수는 "+max+"입니다.");
		scanner.close();
	}

}
