package ch02_ex;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x값을 입력하세요>>");
		int x = scanner.nextInt();
		int y = x*x - 3*x + 7;
		System.out.println("x="+x+", y="+y+"입니다.");
	}

}
