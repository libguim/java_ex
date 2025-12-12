package ch03_problem;

import java.util.Scanner;

public class practice05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("양의 정수 10개를 입력하시오 >>"); //10개니까 담을 변수를 준비해야 함
		int intArray[] = new int[10]; //배열을 만듦

		int n = 0; //초기화
		
		for(int i=0; i<intArray.length; i++) {

			intArray[i] = scanner.nextInt(); 

		} //입력 받음
		
		System.out.print("3의 배수는 ");
		for(int i=0; i<intArray.length; i++) {

			if(intArray[i] % 3 == 0 && intArray[i] != 0) {
				System.out.print(intArray[i] + " ");
			}
			
		} //출력함
		
		scanner.close();
	}

}
