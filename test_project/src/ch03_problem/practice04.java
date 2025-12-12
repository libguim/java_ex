package ch03_problem;

import java.util.Scanner;

public class practice04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("소문자 알파벳 하나를 입력하시오 >>");
		
		String s = scanner.next();
		char c = s.charAt(0); //입력받은 글자 중 첫번째 글자
		
//		예외처리 : 알파벳 소문자인지 체크, 아니면 종료!
		if(c < 'a' || c > 'z') {
			System.out.println("알파벳 소문자만 입력해주세요!!!!!!!");
			return;
		}
		
		for(char i=c; i>='a'; i--) {
			for(char j='a'; j<=i; j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
		
	}

}
