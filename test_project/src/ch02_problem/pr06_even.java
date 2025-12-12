package ch02_problem;

import java.util.Scanner;

public class pr06_even {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.print("1~99사이의 정수를 입력하시오>>");
		int num = a.nextInt();
		
		if((num<10)||(num>99)) {
			System.out.println("2자리 수가 아닙니다!!!!");
			return;
		}
		
		int ten = num / 10;
		int one = num % 10;
		
		int cnt = 0;
		
		if(ten==3 || ten==6 || ten==9) {
			cnt++;
		}
		
		if(one==3 || one==6 || one==9) {
			cnt++;
		}
		
		
//		if(cnt==1) { 
//			System.out.println("박수짝!");
//		}
//		
//		else if(cnt==2) { 
//			System.out.println("박수짝짝!");
//		}
//		else {
//			System.out.println("박수없음!");
//		}
//		
				
		String hand = "";
		
		switch(cnt) {
			case 1: 
				hand = "박수짝!";
				break;
			case 2: 
				hand = "박수짝짝!";
				break;
			case 3: 
				hand = "박수없음!";
				break;		
		}
		
		System.out.println(hand);
		
		
		
		a.close();
	}

}
