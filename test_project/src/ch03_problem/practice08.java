package ch03_problem;

import java.util.Scanner;

public class practice08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //입력기를 만듦
		
		System.out.print("정수 몇 개? >>");
		int a = scanner.nextInt(); //입력값 받음
		int arr[];
		if(a <= 0 || a >= 100) {
			System.out.println("1~99 사이의 수를 입력해주세요!!!");
			scanner.close(); //스캐너 종료
			return;
		}else {			
			arr = new int[a]; //a의 갯수만큼 배열 만듦
		}
		
//		1. 입력
		for(int i=0; i<arr.length; i++) {
			
			int rand = (int)(Math.random()*100 + 1); //Math.random() 실수
			
			//랜덤 수 rand을 기존에 들어간 값들과 전수 비교
			for(int j=0; j<i; j++) {
				if(arr[j] == rand) {
					i--;
					break;
				}else {
					arr[i] = rand;
				}
			}			
		}
		
//		2. 출력		
		for(int i=0; i<arr.length; i++) {
				
			if(i%10 == 0 && i!=0) {
				System.out.println();				
			}
			System.out.print(arr[i]+ " ");

		}
		
		scanner.close();
		
	}

}
