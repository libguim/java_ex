package ch02_ex;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("논리 연산을 입력하세요>>>(예. true OR false)");
		boolean a = scanner.nextBoolean();
		String c = scanner.next();
		boolean b = scanner.nextBoolean();
		
//		if() {
//			return;
//		}
		
		switch(c) {
		case "AND":
			System.out.println("false");
			break;
		case "OR":
			System.out.println("true");
			break;
		default: 
			System.out.println("논리값이 아닙니다!!!");
			scanner.close();
			return;
		}
		
		scanner.close();
	}

}
