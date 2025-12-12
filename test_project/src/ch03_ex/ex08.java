package ch03_ex;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("5개의 정수를 입력하세요.");
		int intArray[] = new int[5];
		double sum = 0.0;
		
		for(int i=0; i<intArray.length; i++) //입력 
			intArray[i] = scanner.nextInt();
			
		for(int i=0; i<intArray.length; i++) //꺼내서 합산
			sum += intArray[i];
		
		System.out.println("평균은" + sum/intArray.length);
		scanner.close();
	}

}
