package ch02_ex;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("2자리수 정수 입력(10~99) >>>");
		int num = a.nextInt();
		
		if(num<10 || num>99) {
			return;
		}
		
		int ten = num / 10; //10의 자리
		int one = num % 10; //1의 자리
		
		if(ten == one) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다");
		}else {
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다");
		}
		
		a.close();
	}

}
