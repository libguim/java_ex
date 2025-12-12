package ch02_problem; //패키지명
//import java.util.Scanner; //스캐너 입력값받는 구문

import java.util.Scanner;

public class pr01_dollar { //클래스명

	public static void main(String[] args) { //mian 메소드
		
		Scanner sc1 = new Scanner(System.in); //보통 위에 선언
		
		System.out.print("원화를 입력하세요(단위 : 원)>>");
		int won = sc1.nextInt();
		double dollar = won / 1216.0; // int / double = double
		dollar = (int)(dollar * 100) / 100.0; //dollar의 형 변환 계산
		
		System.out.println(won +"원은 $" + dollar + "입니다.");
		
		sc1.close(); // 스캐너 입력기 종료		
	}

}
