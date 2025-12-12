package ch02_ex;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("학점을 입력하세요(A~F) >>");
		String grade = a.next();
		
		switch(grade) {
			case "A":
			case "B":
				System.out.println("Excellent!!");
				break;
			case "C":
			case "D":
				System.out.println("Goooood!");
				break;
			case "F":
				System.out.println("Bye~ Bye~");
				break;
			default:
				System.out.println("해당사항 없음");
				a.close();
				return;
		}
		
		a.close();
	}

}
