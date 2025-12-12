package ch02_problem;

import java.util.Scanner;

public class pr02_integer {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in); //import와 함께 복사됨
		
		System.out.print("2자리수 정수 입력(10~99) >>>");
		int num = a.nextInt();
		
		if((num<10)||(num>99)) {
			System.out.println("2자리의 수만 입력가능합니다!");
			return; //main 함수 종료
		}
		
		int ten = num / 10; //10의 자리
		int one = num % 10; //1의 자리
		
		if(ten == one) {
			
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
			
		}else {
			
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
		}
		
		a.close();	
	}

}
