package test;

import java.util.Scanner;

public class Multiple3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//1. 배열 생성
		System.out.print("양의 정수 10개 입력 >>");
		int n[] = new int[10];

		//2. 입력 받기
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
			
			//예외처리
			if(n[i] <= 0) {
				System.out.println("0보다 큰 수를 입력해주세요!");
				return;
			}
		}

		//3. 3의 배수만 출력
		System.out.print("3의 배수는 : ");
		for (int i = 0; i < n.length; i++) {
			if (n[i] % 3 == 0) {
				System.out.print(n[i] + " ");
			}
		}

		sc.close();
	}

}
