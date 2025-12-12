package ch04.ex07;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Book[] book = new Book[2]; //객체 배열 생성
		
		Scanner scanner = new Scanner(System.in);

		//입력
		for(int i=0; i<book.length; i++) {
			System.out.print("제목>>");
			String title = scanner.nextLine();
			System.out.print("저자>>");
			String author = scanner.nextLine();
			book[i] = new Book(title, author); //배열 원소 객체 생성
		}
		
		//출력
		for(int i=0; i<book.length; i++) {
			System.out.print("("+book[i].title+", "+book[i].author+")");
		}
		
		scanner.close();
		
	}

}
