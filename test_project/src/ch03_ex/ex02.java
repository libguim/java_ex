package ch03_ex;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = 0, n = 0;
		double sum = 0;
		
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요!");
		while((n=scanner.nextInt()) != 0) { //0이면 while문 벗어남
			
			sum = sum + n;
			count++;
			
		}//while문
		
		System.out.println("수의 개수는 "+count+"개이며 ");
		double num = (int)(sum/count*100)/100.0;
		System.out.println("평균은 "+num+"입니다.");
		
		scanner.close();
	}

}
