package ch04_problem.Ex10;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("한글 단어 검색 프로그램입니다.");
		
		while(true) {
			
			System.out.print("한글 단어 입력 >>");
			String word = scanner.next();
			
			if(word.equals("그만")) {
				System.out.println("종료합니다!!!");
				break;
			}
			
			String eng = Dictionary.kor2Eng(word);
			
			if(eng == null) {
				System.out.println(word+"은 저의 사전에 없습니다.");
			}else {
				System.out.println(word+"는 "+eng+"입니다.");
			}

		}
		
				
	}

}
