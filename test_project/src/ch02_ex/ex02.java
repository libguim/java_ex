package ch02_ex;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("몇 층인지 입력하세요>>");
		int a = scanner.nextInt();
		
		int h = a * 5;
		System.out.println("건물은 "+h+"m입니다.");
	}

}
