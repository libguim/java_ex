package ch02_problem;

import java.util.Scanner;

public class pr12_ssssssss {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("연산 >>");
		double a = scanner.nextDouble();
		String b = scanner.next();
		double c = scanner.nextDouble();
		
		double num = 0;
		
//		1) if - else 문
//		if(b.equals("+")) {
//			num = a + c;
//		}else if(b.equals("-")) {
//			num = a - c;
//		}else if(b.equals("*")) {
//			num = a * c;
//		}else  {
//			if(c == 0) {
//				System.out.println("0으로 나눌 수 없습니다.");
//				return;
//			}
//			num = a / c;
//			num = (int)(num * 100)/100.0;
//			return;
//		}
		
		
//		2) switch - case 문
		
		switch(b) {
			case "+":
				num = a + c;
				break;
			case "-":
				num = a - c;
				break;
			case "*":
				num = a * c;
				break;
			case "/":
				if(c == 0) {
					System.out.println("0으로 나눌 수 없습니다.");
					return;
				}
				num = a / c;
				num = (int)(num * 100)/100.0; 
				break;
			default : 
				System.out.println("잘못된 연산입니다.");
				scanner.close();
				return;
		}
	
		System.out.println(a + b + c + "의 계산 결과는 "+ num +"입니다.");
		
		scanner.close();
	}

}
