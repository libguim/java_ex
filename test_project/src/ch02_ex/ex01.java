package ch02_ex;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두 정수를 입력하세요 >>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int num = a + b;
		System.out.println(""+a+" + "+b+"는 "+num+"입니다.");
		
		scanner.close();
	}

}
